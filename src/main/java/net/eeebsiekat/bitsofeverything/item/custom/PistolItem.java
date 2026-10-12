package net.eeebsiekat.bitsofeverything.item.custom;

import net.eeebsiekat.bitsofeverything.tags.ModTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.hurtingprojectile.SmallFireball;
import net.minecraft.world.entity.projectile.hurtingprojectile.WitherSkull;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.function.Predicate;

public class PistolItem extends SniperItem {
    public PistolItem(Properties properties) {
        super(properties);
    }

    @Override
    public void onUseTick(Level level, LivingEntity livingEntity, ItemStack stack, int remainingUseDuration) {
        if (livingEntity instanceof Player player) {
            int ticksElapsed = this.getUseDuration(stack, livingEntity) - remainingUseDuration;

            if (ticksElapsed >= 0 && ticksElapsed <= 20 && ticksElapsed % 4 == 0) {
                ItemStack projectileStack = player.getProjectile(stack);

                if (projectileStack.isEmpty() && !player.hasInfiniteMaterials()) {
                    player.stopUsingItem();
                    return;
                }

                if (level instanceof ServerLevel serverLevel) {
                    Vec3 lookVec = player.getLookAngle();

                    SmallFireball fireball = new SmallFireball(
                            serverLevel,
                            player.getX() + lookVec.x * 1.0D,
                            player.getY() + player.getEyeHeight() + lookVec.y * 1.0D,
                            player.getZ() + lookVec.z * 1.0D,
                            lookVec
                    );
                    fireball.setOwner(player);
                    fireball.setDeltaMovement(lookVec.scale(2.0D));
                    fireball.setPos(player.getX(), player.getY() + 1, player.getZ());
                    serverLevel.addFreshEntity(fireball);

                    if (!player.hasInfiniteMaterials()) {
                        projectileStack.shrink(1);
                        if (projectileStack.isEmpty()) {
                            player.getInventory().removeItem(projectileStack);
                        }
                    }

                    stack.hurtAndBreak(1, serverLevel, player, p -> {});
                }

                level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.FIRECHARGE_USE, SoundSource.PLAYERS, 1.0f, 1.5f);
                player.awardStat(Stats.ITEM_USED.get(this));

                if (ticksElapsed == 20) {
                    player.getCooldowns().addCooldown(stack, 100);
                    player.stopUsingItem();
                }
                else {
                    player.getCooldowns().addCooldown(stack, 20);
                }
            }
        }
    }

    @Override
    public boolean releaseUsing(ItemStack itemStack, Level level, LivingEntity entity, int remainingTime) {
        return true;
    }

    @Override
    public ItemUseAnimation getUseAnimation(ItemStack itemStack) {
        return ItemUseAnimation.SPYGLASS;
    }

    @Override
    public Predicate<ItemStack> getAllSupportedProjectiles() {
        return itemStack -> itemStack.is(Items.FIRE_CHARGE);
    }
}