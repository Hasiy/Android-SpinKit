package top.hasiy.spinkit.style;

import android.animation.ValueAnimator;

import top.hasiy.spinkit.animation.SpriteAnimatorBuilder;
import top.hasiy.spinkit.sprite.CircleSprite;
import top.hasiy.spinkit.sprite.Sprite;
import top.hasiy.spinkit.sprite.SpriteContainer;

/**
 * Created by Hasiy. Heartbeat
 */
public class Heartbeat extends SpriteContainer {

    @Override
    public Sprite[] onCreateChild() {
        return new Sprite[]{
                new CircleOne(), new CircleTwo()
        };
    }

    @Override
    public void onChildCreated(Sprite... sprites) {
        super.onChildCreated(sprites);
    }

    private class CircleOne extends CircleSprite {
        CircleOne() {
            setAlpha(30);
            setScale(0f);
        }

        @Override
        public ValueAnimator onCreateAnimation() {
            float[] fractions = new float[]{0f, 0.75f, 1f};
            return new SpriteAnimatorBuilder(this)
                    .scale(fractions, 0.6f, 1f, 0.6f)
                    .duration(1000)
                    .easeInOut(fractions)
                    .build();
        }
    }

    private class CircleTwo extends CircleSprite {
        CircleTwo() {
            setAlpha(220);
            setScale(0f);
        }

        @Override
        public ValueAnimator onCreateAnimation() {
            float[] fractions = new float[]{0f, 0.75f, 1f};
            return new SpriteAnimatorBuilder(this)
                    .scale(fractions, 0.35f, 0.55f, 0.35f)
                    .duration(1000)
                    .easeInOut(fractions)
                    .build();
        }
    }


}
