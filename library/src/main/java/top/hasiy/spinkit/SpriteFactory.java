package top.hasiy.spinkit;

import top.hasiy.spinkit.sprite.Sprite;
import top.hasiy.spinkit.style.ChasingDots;
import top.hasiy.spinkit.style.Circle;
import top.hasiy.spinkit.style.CubeGrid;
import top.hasiy.spinkit.style.DoubleBounce;
import top.hasiy.spinkit.style.FadingCircle;
import top.hasiy.spinkit.style.FoldingCube;
import top.hasiy.spinkit.style.Heartbeat;
import top.hasiy.spinkit.style.MultiplePulse;
import top.hasiy.spinkit.style.MultiplePulseRing;
import top.hasiy.spinkit.style.Pulse;
import top.hasiy.spinkit.style.PulseRing;
import top.hasiy.spinkit.style.RotatingCircle;
import top.hasiy.spinkit.style.RotatingPlane;
import top.hasiy.spinkit.style.ThreeBounce;
import top.hasiy.spinkit.style.WanderingCubes;
import top.hasiy.spinkit.style.Wave;

/**
 * Created by ybq.
 */
public class SpriteFactory {

    public static Sprite create(Style style) {
        Sprite sprite = null;
        switch (style) {
            case ROTATING_PLANE:
                sprite = new RotatingPlane();
                break;
            case DOUBLE_BOUNCE:
                sprite = new DoubleBounce();
                break;
            case WAVE:
                sprite = new Wave();
                break;
            case WANDERING_CUBES:
                sprite = new WanderingCubes();
                break;
            case PULSE:
                sprite = new Pulse();
                break;
            case CHASING_DOTS:
                sprite = new ChasingDots();
                break;
            case THREE_BOUNCE:
                sprite = new ThreeBounce();
                break;
            case CIRCLE:
                sprite = new Circle();
                break;
            case CUBE_GRID:
                sprite = new CubeGrid();
                break;
            case FADING_CIRCLE:
                sprite = new FadingCircle();
                break;
            case FOLDING_CUBE:
                sprite = new FoldingCube();
                break;
            case ROTATING_CIRCLE:
                sprite = new RotatingCircle();
                break;
            case MULTIPLE_PULSE:
                sprite = new MultiplePulse();
                break;
            case PULSE_RING:
                sprite = new PulseRing();
                break;
            case MULTIPLE_PULSE_RING:
                sprite = new MultiplePulseRing();
                break;
            case HEART_BEAT:
                sprite = new Heartbeat();
                break;
            default:
                break;
        }
        return sprite;
    }
}
