package cartoon;

/**
 * This is the Constants class which controls the dimensions of the scene height and
 * width. The initial width and height of the front of the house are also defined here
 * and the dimensions of the door and window are determined based off of the initial
 * house width and height dimensions. Additionally, the starting location of the house
 * is also declared here.
 */
public class Constants {
    public static final double SCENE_WIDTH = 1000;
    public static final double SCENE_HEIGHT = 1000;

    public static final double HOUSE_WIDTH = 200;
    public static final double HOUSE_HEIGHT = 100;
    public static final double WINDOW_WIDTH = HOUSE_WIDTH/4;
    public static final double WINDOW_HEIGHT = HOUSE_HEIGHT/3;
    public static final double DOOR_WIDTH = HOUSE_WIDTH/5;
    public static final double DOOR_HEIGHT = 0.75*HOUSE_HEIGHT;

    public static final double HOUSE_X_LOC = 0;
    public static final double HOUSE_Y_LOC = 200;

}
