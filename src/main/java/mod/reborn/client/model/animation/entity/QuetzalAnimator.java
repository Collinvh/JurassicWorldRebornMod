package mod.reborn.client.model.animation.entity;

import mod.reborn.client.model.AnimatableModel;
import mod.reborn.client.model.animation.EntityAnimator;
import mod.reborn.server.entity.dinosaur.PteranodonEntity;
import mod.reborn.server.entity.dinosaur.QuetzalEntity;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class QuetzalAnimator extends EntityAnimator<QuetzalEntity>
{
    @Override
    protected void performAnimations(AnimatableModel model, QuetzalEntity entity, float f, float f1, float ticks, float rotationYaw, float rotationPitch, float scale) {
        AdvancedModelRenderer leftThigh = model.getCube("Left thigh");
        AdvancedModelRenderer leftCalf = model.getCube("Left calf");
        AdvancedModelRenderer leftUpperFoot = model.getCube("Left upper foot");
        AdvancedModelRenderer leftFoot = model.getCube("Left foot");
        AdvancedModelRenderer rightThigh = model.getCube("Right thigh");
        AdvancedModelRenderer rightCalf = model.getCube("right calf");
        AdvancedModelRenderer rightUpperFoot = model.getCube("Right upper foot");
        AdvancedModelRenderer rightFoot = model.getCube("Right foot");
        AdvancedModelRenderer jaw = model.getCube("Lower jaw 1");
        AdvancedModelRenderer head = model.getCube("Head ");
        AdvancedModelRenderer neck3 = model.getCube("Neck 3");
        AdvancedModelRenderer neck2 = model.getCube("Neck 2");
        AdvancedModelRenderer neck1 = model.getCube("Neck 1");
        AdvancedModelRenderer body3 = model.getCube("Body 3");
        AdvancedModelRenderer body2 = model.getCube("Body 2");
        AdvancedModelRenderer body1 = model.getCube("Body 1");
        AdvancedModelRenderer tail1 = model.getCube("Tail 1");
        AdvancedModelRenderer tail2 = model.getCube("Tail 2");
        AdvancedModelRenderer tail3 = model.getCube("Tail 3");
        AdvancedModelRenderer leftArm1 = model.getCube("Left Arm 1");
        AdvancedModelRenderer leftArm2 = model.getCube("Left Arm 2");
        AdvancedModelRenderer leftArm3 = model.getCube("Left Arm 3");
        AdvancedModelRenderer leftArm4 = model.getCube("Left Arm 4");
        AdvancedModelRenderer rightArm1 = model.getCube("Right Arm 1");
        AdvancedModelRenderer rightArm2 = model.getCube("Right Arm 2");
        AdvancedModelRenderer rightArm3 = model.getCube("Right Arm 3");
        AdvancedModelRenderer rightArm4 = model.getCube("Right Arm 4");

        AdvancedModelRenderer[] neck = new AdvancedModelRenderer[]{head, neck3, neck2, neck1};
        AdvancedModelRenderer[] tail = new AdvancedModelRenderer[]{tail1, tail2, tail3};
        AdvancedModelRenderer[] wingLeft = new AdvancedModelRenderer[]{leftArm4, leftArm3, leftArm2, leftArm1};
        AdvancedModelRenderer[] wingRight = new AdvancedModelRenderer[]{rightArm4, rightArm3, rightArm2, rightArm1};
        AdvancedModelRenderer[] legLeft = new AdvancedModelRenderer[]{leftThigh, leftCalf, leftUpperFoot, leftFoot};
        AdvancedModelRenderer[] legRight = new AdvancedModelRenderer[]{rightThigh, rightCalf, rightUpperFoot, rightFoot};

        float globalSpeed = 0.5F;
        float globalDegree = 2F;
        float globalHeight = 2F;
        float frontOffset = -1.35f;

        if (entity.isOnGround() && !entity.isCarcass()) {
        } else {
            if(!entity.isCarcass()) {
                body1.rotateAngleX += 0.3;
                neck1.rotateAngleX -= 0.1;
                leftThigh.rotateAngleX += 0.8;
                rightThigh.rotateAngleX += 0.8;
                leftCalf.rotateAngleX += 0.7;
                rightCalf.rotateAngleX += 0.7;
                leftUpperFoot.rotateAngleX -= 0.3;
                rightUpperFoot.rotateAngleX -= 0.3;
                leftFoot.rotateAngleX += 2;
                rightFoot.rotateAngleX += 2;
                leftArm1.rotateAngleZ -= 0.8;
                leftArm2.rotateAngleZ -= 0.4;
                leftArm3.rotateAngleZ -= 0.2;
                leftArm4.rotateAngleZ += 3.3;
                leftArm4.rotateAngleY += 2.6;
                leftArm4.rotateAngleX += 1.2;
                rightArm1.rotateAngleZ += 0.8;
                rightArm2.rotateAngleZ += 0.4;
                rightArm3.rotateAngleZ += 0.2;
                rightArm4.rotateAngleZ -= 3.3;
                rightArm4.rotateAngleY -= 2.6;
                rightArm4.rotateAngleX += 1.2;

                model.bob(body1, 0.1f, 7, false, f, f1);
                model.bob(leftThigh, 0.1f, 7, false, f, f1);
                model.bob(rightThigh, 0.1f, 7, false, f, f1);
                model.walk(body1, 0.1f, 0.2f, true, 1, 0, f, f1);
                model.swing(leftArm1, 0.1f, 0.2f, false, 1, 0, f, f1);
                model.swing(leftArm2, 0.1f, 0.2f, false, 1, 0, f, f1);

                model.chainFlap(wingLeft, 0.2f, 0.4f, 2, f, f1);
                model.walk(leftArm2, 0.2f, 0.8f, true, -1f, 0, f, f1);
                model.walk(leftArm3, 0.2f, 0.8f, false, -1f, 0.2f, f, f1);
                model.chainFlap(wingRight, 0.2f, -0.4f, 2, f, f1);
                model.walk(rightArm2, 0.2f, 0.8f, true, -1f, 0, f, f1);
                model.walk(rightArm3, 0.2f, 0.8f, false, -1f, 0.2f, f, f1);
                model.chainWave(legLeft, 0.1f, 0.2f, -3, f, f1);
                model.chainWave(legRight, 0.1f, 0.2f, -3, f, f1);
                model.chainWave(tail, 0.1f, 0.2f, 1, f, f1);
            }
        }
        if (!entity.isCarcass()) {
            model.walk(body1, 0.08f, -0.05f, false, 0, 0, ticks, 0.25F);
            model.chainWave(neck, 0.08f, 0.03f, 2, ticks, 0.25F);
            model.walk(leftArm1, 0.08f, 0.1f, false, 0, 0, ticks, 0.25F);
            model.walk(rightArm1, 0.08f, 0.1f, false, 0, 0, ticks, 0.25F);
            model.walk(leftArm2, 0.08f, 0.1f, false, 0, 0, ticks, 0.25F);
            model.walk(rightArm2, 0.08f, 0.1f, false, 0, 0, ticks, 0.25F);
            model.walk(leftArm3, 0.08f, 0.2f, true, 0, 0, ticks, 0.25F);
            model.walk(rightArm3, 0.08f, 0.2f, true, 0, 0, ticks, 0.25F);
            model.flap(leftArm1, 0.08f, 0.03f, false, 0, 0, ticks, 0.25F);
            model.flap(rightArm1, 0.08f, 0.03f, true, 0, 0, ticks, 0.25F);
            leftArm1.rotationPointZ -= 1 * Math.cos(ticks * 0.08);
            rightArm1.rotationPointZ -= 1 * Math.cos(ticks * 0.08);
        }
    }
}
