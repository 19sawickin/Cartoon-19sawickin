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

/**
 * This is the top-level class that contains most of the logic of the program. The composite
 * shape is constructed here along with the changing label. The timeline is also set up here
 * which controls movement of the composite shape. Two event handlers are also created to
 * control changing the composite shape's color when a specific key is pressed and to control
 * movement of the composite shape while also changing the label depending on the composite
 * shape's position.
 */
public class Cartoon {

    private House _house;
    private Label _label;

    /**
     * THe Cartoon constructor constructs the composite shape and the label and sets up
     * the event handlers and timelines. It also adds sets up the bottom pane.
     */
    public Cartoon(Pane housePane, HBox bottomPane) {
        _house = new House(housePane);
        _label = new Label("Hello");
        this.setupBottomPane(bottomPane);
        housePane.addEventHandler(KeyEvent.KEY_PRESSED, new KeyHandler());
        housePane.setFocusTraversable(true);
        this.setupTimeline();
    }

    /**
     * This method adds the label to bottomPane.
     */
    public void setupBottomPane(HBox bottomPane) {
        bottomPane.getChildren().add(_label);
    }

    /**
     * This method sets up the timeline that controls movement of the composite
     * shape across the screen. Each keyframe is 0.1 seconds and it calls on the
     * MoveHandler to change the composite shape's position every 0.1 seconds.
     */
    public void setupTimeline() {
        Timeline timeline = new Timeline
                (new KeyFrame(Duration.seconds(0.1), new MoveHandler()));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    /**
     * This private class is responsible for moving the house by 20 pixels
     * to the right every 0.1 seconds. If the house disappears off the right
     * of the screen, it will wrap back around to the left side. Additionally,
     * when the house moves past the half-way point of the screen, the label
     * changes what it says.
     */
    private class MoveHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent event) {
            if(_house.getXLoc() < Constants.SCENE_WIDTH) {
                _house.setLocation(_house.getXLoc() + 20, Constants.HOUSE_Y_LOC);
            } else _house.setLocation(Constants.HOUSE_X_LOC, Constants.HOUSE_Y_LOC);

            if(_house.getXLoc() > Constants.SCENE_WIDTH/2) {
                _label.setText("Hurry up and change my paint!");
            } else _label.setText("Change my paint color");
        }
    }

    /**
     * This private class controls changing the house color. When
     * "R" is pressed, the front of the house turns red. When "B"
     * is pressed, the front of the house turns blue. And when "G"
     * is pressed, the front of the house turns green.
     */
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
