package cartoon;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

/**
 * This class is responsible for constructing the composite shape which is a house. It
 * is made of a rectangle for the front of the house, two rectangle windows, a rectangle
 * door, and a triangle polygon roof.
 */
public class House {

    private Rectangle _front, _leftWindow, _rightWindow, _door;
    private Polygon _roof;

    /**
     * The House constructor is responsible for generating all of the components
     * of the composite house shape, setting their dimensions, then setting their
     * default fill colors.
     */
    public House(Pane housePane) {
        // the front of the house is constructed
        _front = new Rectangle(Constants.HOUSE_WIDTH, Constants.HOUSE_HEIGHT);
        _front.setFill(Color.RED);
        // the left window is constructed
        _leftWindow = new Rectangle(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        _leftWindow.setFill(Color.GRAY);
        // the right window is constructed
        _rightWindow = new Rectangle(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        _rightWindow.setFill(Color.GRAY);
        // the door is constructed
        _door = new Rectangle(Constants.DOOR_WIDTH, Constants.DOOR_HEIGHT);
        _door.setFill(Color.BLACK);
        // the roof is constructed
        _roof = new Polygon(Constants.HOUSE_X_LOC,Constants.HOUSE_Y_LOC,
                Constants.HOUSE_X_LOC + Constants.HOUSE_WIDTH,Constants.HOUSE_Y_LOC,
                Constants.HOUSE_X_LOC+0.5*Constants.HOUSE_WIDTH,
                Constants.HOUSE_Y_LOC-Constants.HOUSE_HEIGHT);
        _roof.setFill(Color.GRAY);
        // the original location is set then all shapes are added to the housePane
        this.setLocation(Constants.HOUSE_X_LOC, Constants.HOUSE_Y_LOC);
        housePane.getChildren().addAll(_front, _leftWindow, _rightWindow, _door, _roof);
    }

    /**
     * The location of each of the composite shapes are set using arguments that are
     * passed through from the MoveHandler event handler in Cartoon class.
     */
    public void setLocation(double x, double y) {
        _front.setX(x);
        _front.setY(y);
        _leftWindow.setX(x + 0.1*Constants.HOUSE_WIDTH);
        _leftWindow.setY(y + 0.5*Constants.HOUSE_HEIGHT - 0.5*Constants.WINDOW_HEIGHT);
        _rightWindow.setX(x + Constants.HOUSE_WIDTH - Constants.WINDOW_WIDTH - 0.1*Constants.HOUSE_WIDTH);
        _rightWindow.setY(y + 0.5*Constants.HOUSE_HEIGHT - 0.5*Constants.WINDOW_HEIGHT);
        _door.setX(x + 0.5*Constants.HOUSE_WIDTH - 0.5*Constants.DOOR_WIDTH);
        _door.setY(y + Constants.HOUSE_HEIGHT - Constants.DOOR_HEIGHT);
        _roof.setTranslateX(x);
    }

    /**
     * The x-location of the front of the house is returned so that the MoveHandler
     * event handler in the Cartoon class can check to see if the house is on the
     * right edge of the screen or not. This also helps the label determine when
     * it needs to change, since when the value returned here is half of the screen
     * width, it will change.
     */
    public double getXLoc() {
        return _front.getX();
    }

    /**
     * This method returns the front of the house so that it can change colors in the
     * cartoon class and control movement.
     */
    public Rectangle getFront() {
        return _front;
    }

}
