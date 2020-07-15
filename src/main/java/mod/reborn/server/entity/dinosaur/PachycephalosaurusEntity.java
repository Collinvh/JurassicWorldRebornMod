package mod.reborn.server.entity.dinosaur;

import mod.reborn.server.entity.DinosaurEntity;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.world.World;

public class PachycephalosaurusEntity extends DinosaurEntity
{
    public PachycephalosaurusEntity(World world)
    {
        super(world);
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
    }
}
