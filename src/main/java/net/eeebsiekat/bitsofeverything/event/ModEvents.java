package net.eeebsiekat.bitsofeverything.event;

import net.eeebsiekat.bitsofeverything.ALittleBitofEverything;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.animal.equine.SkeletonHorse;
import net.minecraft.world.entity.animal.equine.ZombieHorse;
import net.minecraft.world.entity.monster.zombie.Zombie;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityStruckByLightningEvent;

@EventBusSubscriber(modid = ALittleBitofEverything.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void entityStruckByLightningEvent(EntityStruckByLightningEvent event) {
        if (event.getEntity() instanceof SkeletonHorse skeletonHorse) {
            if (!skeletonHorse.getPassengers().isEmpty() && skeletonHorse.getFirstPassenger() instanceof Zombie zombie) {
                skeletonHorse.remove(Entity.RemovalReason.DISCARDED);
                zombie.remove(Entity.RemovalReason.DISCARDED);

                if (!event.getEntity().level().isClientSide() && event.getEntity().level() instanceof ServerLevel serverLevel) {
                    BlockPos pos = event.getEntity().blockPosition().above();

                    ZombieHorse zombieHorse = EntityTypes.ZOMBIE_HORSE.create(serverLevel, EntitySpawnReason.EVENT);
                    if (zombieHorse != null) {
                        zombieHorse.setPos(pos.getX(), pos.getY(), pos.getZ());
                        serverLevel.addFreshEntity(zombieHorse);
                        zombieHorse.extinguishFire();
                    }
                }
            }
        }
    }
}
