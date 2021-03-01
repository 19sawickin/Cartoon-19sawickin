package cartoon;

public class Constants {
    public static final double HOUSE_WIDTH = 100;
    public static final double HOUSE_HEIGHT = 100;
    public static final double WINDOW_WIDTH = HOUSE_WIDTH/4;
    public static final double WINDOW_HEIGHT = HOUSE_HEIGHT/3;
    public static final double DOOR_WIDTH = HOUSE_WIDTH/5;
    public static final double DOOR_HEIGHT = 0.75*HOUSE_HEIGHT;

    public static final double HOUSE_X_LOC = 10;
    public static final double HOUSE_Y_LOC = 10;
    public static final double L_WINDOW_X_LOC = HOUSE_X_LOC + 0.1*HOUSE_WIDTH;
    public static final double L_WINDOW_Y_LOC = HOUSE_Y_LOC + 0.125*HOUSE_HEIGHT;
    public static final double R_WINDOW_X_LOC = HOUSE_X_LOC + HOUSE_WIDTH - WINDOW_WIDTH - 0.1*HOUSE_WIDTH;
    public static final double R_WINDOW_Y_LOC = L_WINDOW_Y_LOC;
}
