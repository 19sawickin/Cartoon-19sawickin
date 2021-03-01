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
        _leftWindow = new Rectangle()

    }
}
