package cartoon;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import javafx.scene.input.KeyEvent;

public class Cartoon {
    // TODO: this is your top-level logic class! It should contain your event handlers, other "game" logic, and an instance of your composite shape!
    private House _house;
    private Label _label;

    public Cartoon(Pane housePane, HBox bottomPane) {
        _house = new House(housePane);
        _label = new Label("Hello");
        this.setupBottomPane(bottomPane);
        housePane.addEventHandler(KeyEvent.KEY_PRESSED, new KeyHandler());
        housePane.setFocusTraversable(true);
        this.setupTimeline();
    }

    public void setupBottomPane(HBox bottomPane) {
        bottomPane.getChildren().add(_label);
    }

    public void setupTimeline() {
        Timeline timeline = new Timeline
                (new KeyFrame(Duration.seconds(0.1), new MoveHandler()));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    private class MoveHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent event) {
            if(_house.getXLoc() < Constants.SCENE_WIDTH) {
                _house.setLocation(_house.getXLoc() + 20, _house.getYLoc());
            } else _house.setLocation(Constants.HOUSE_X_LOC, Constants.HOUSE_Y_LOC);

            if(_house.getXLoc() > Constants.SCENE_WIDTH/2) {
                _label.setText("Hurry up and change my paint!");
            } else _label.setText("Change my paint color");
        }
    }

    private class KeyHandler implements EventHandler<KeyEvent> {

        public void handle(KeyEvent event) {
            switch(event.getCode()) {
                case R:
                    _house.getFront().setFill(Color.RED);
                    break;
                case B:
                    _house.getFront().setFill(Color.BLUE);
                    break;
                case G:
                    _house.getFront().setFill(Color.GREEN);
                    break;
                default:
                    break;
            }
        }
    }
}
