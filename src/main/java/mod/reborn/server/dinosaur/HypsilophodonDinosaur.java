package mod.reborn.server.dinosaur;


import mod.reborn.server.entity.Diet;
import mod.reborn.server.entity.dinosaur.HypsilophodonEntity;
import mod.reborn.server.period.TimePeriod;

public class HypsilophodonDinosaur extends Dinosaur
{
    public static final double SPEED = 0.3F;
    public HypsilophodonDinosaur()
    {
        super();

        this.setName("Hypsilophodon");
        this.setDinosaurType(DinosaurType.SCARED);
        this.setDinosaurClass(HypsilophodonEntity.class);
        this.setTimePeriod(TimePeriod.CRETACEOUS);
        this.setEggColorMale(0x7DAC78, 0x3E6226);
        this.setEggColorFemale(0x799073, 0x33432F);
        this.setHealth(3, 10);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setStrength(1, 5);
        this.setMaximumAge(fromDays(35));
        this.setEyeHeight(0.2F, 0.7F);
        this.setSizeX(0.2F, 0.6F);
        this.setSizeY(0.25F, 0.85F);
        this.setStorage(9);
        this.setDiet((Diet.HERBIVORE.get()));
        this.setBones("arm_bones", "leg_bones", "neck_vertebrae", "pelvis", "ribcage", "shoulder", "skull", "tooth", "arm_bones");
        this.setHeadCubeName("Head ");
        this.setBreeding(false, 2, 6, 20, false, true);
        this.setAttackBias(-50);
        this.setImprintable(true);
        this.setStorage(6);
        this.setScale(0.65F, 0.2F);
    }
}