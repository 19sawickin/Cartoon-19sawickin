package cartoon;

import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class House {
    private Rectangle _front, _leftWindow, _rightWindow, _door;
    private Polygon _roof;

    public House(BorderPane housePane) {
        _front = new Rectangle(Constants.HOUSE_WIDTH, Constants.HOUSE_HEIGHT);
        _front.setFill(Color.RED);
        _leftWindow = new Rectangle(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        _leftWindow.setFill(Color.GRAY);
        _rightWindow = new Rectangle(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        _rightWindow.setFill(Color.GRAY);
        _door = new Rectangle(Constants.DOOR_WIDTH, Constants.DOOR_HEIGHT);
        _door.setFill(Color.BLACK);
        housePane.getChildren().addAll(_front, _leftWindow, _rightWindow, _door);
        this.setLocation(Constants.DOOR_X_LOC, Constants.DOOR_Y_LOC);
    }

    public void setLocation(double x, double y) {
        _front.setX(x);
        _front.setY(y);
        _leftWindow.setX(x + 0.1*Constants.HOUSE_WIDTH);
        _leftWindow.setY(y + 0.125*Constants.HOUSE_HEIGHT);
        _rightWindow.setX(x + Constants.HOUSE_WIDTH - Constants.WINDOW_WIDTH - 0.1*Constants.HOUSE_WIDTH);
        _rightWindow.setY(y + 0.125*Constants.HOUSE_HEIGHT);
        _door.setX(x + 0.5*Constants.HOUSE_WIDTH - 0.5*Constants.DOOR_WIDTH);
        _door.setY(y + Constants.HOUSE_HEIGHT - Constants.DOOR_HEIGHT);


    }
}
