package net.eeebsiekat.bitsofeverything.item.custom;

import net.eeebsiekat.bitsofeverything.tags.ModTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.hurtingprojectile.WitherSkull;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.function.Predicate;

public class SniperItem extends BowItem {
    public SniperItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean releaseUsing(ItemStack itemStack, Level level, LivingEntity entity, int remainingTime) {
        if(entity instanceof Player player) {
            ItemStack projectileStack = player.getProjectile(itemStack);

            if(projectileStack.isEmpty() && !player.hasInfiniteMaterials()) {
                return false;
            }

            int timeHeld = this.getUseDuration(itemStack, entity) - remainingTime;
            float pow = getPowerForTime(timeHeld);

            if((double) pow < 0.1) {
                return false;
            }

            if(level instanceof ServerLevel serverLevel) {
                Vec3 lookVec = player.getLookAngle();

                WitherSkull witherSkull = new WitherSkull(
                        serverLevel,
                        player,
                        lookVec
                );
                witherSkull.setOwner(player);
                witherSkull.setDeltaMovement(lookVec.scale(10D));
                witherSkull.setPos(player.getX(), player.getY() + 1, player.getZ());
                serverLevel.addFreshEntity(witherSkull);

                if(!player.hasInfiniteMaterials()) {
                    projectileStack.shrink(1);
                    if(projectileStack.isEmpty()) {
                        player.getInventory().removeItem(projectileStack);
                    }
                }
                itemStack.hurtAndBreak(1, serverLevel, player, p -> {});
            }
            level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.FIRECHARGE_USE, SoundSource.PLAYERS, 1.0f, 1.2f);
            player.awardStat(Stats.ITEM_USED.get(this));

            player.getCooldowns().addCooldown(itemStack, 40);

            return true;
        }
        return false;
    }

    @Override
    public ItemUseAnimation getUseAnimation(ItemStack itemStack) {
        return ItemUseAnimation.SPYGLASS;
    }

    @Override
    public Predicate<ItemStack> getAllSupportedProjectiles() {
        return itemStack -> itemStack.is(Items.SKELETON_SKULL) || itemStack.is(Items.WITHER_SKELETON_SKULL);
    }
}
