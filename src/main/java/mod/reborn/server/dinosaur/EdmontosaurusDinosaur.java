package mod.reborn.server.dinosaur;


import mod.reborn.server.entity.Diet;
import mod.reborn.server.entity.dinosaur.EdmontosaurusEntity;
import mod.reborn.server.period.TimePeriod;

public class EdmontosaurusDinosaur extends Dinosaur
{
    public static final double SPEED = 0.41F;
    public EdmontosaurusDinosaur()
    {
        super();

        this.setName("Edmontosaurus");
        this.setDinosaurType(DinosaurType.PASSIVE);
        this.setDinosaurClass(EdmontosaurusEntity.class);
        this.setTimePeriod(TimePeriod.CRETACEOUS);
        this.setEggColorMale(0xB97840, 0x644329);
        this.setEggColorFemale(0x8F8039, 0x615A30);
        this.setHealth(10, 40);
        this.setStrength(5, 20);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setMaximumAge(fromDays(50));
        this.setEyeHeight(0.55F, 3.45F);
        this.setSizeX(0.5F, 2.8F);
        this.setSizeY(0.8F, 4.25F);
        this.setStorage(45);
        this.setDiet((Diet.HERBIVORE.get()));
        this.setBones("cheek_teeth", "pelvis", "skull", "front_leg_bones", "hind_leg_bones", "ribcage", "shoulder", "tail_vertebrae", "neck_vertebrae");
        this.setHeadCubeName("Head");
        this.setScale(2.65F, 0.45F);
        this.setOffset(0.0F, 0.775F, 0.0F);
        this.setAttackBias(80);
        this.setImprintable(true);
        this.setStorage(24);
        this.setBreeding(false, 2, 6, 20, false, true);

    }
}