package cartoon;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Cartoon {
    // TODO: this is your top-level logic class! It should contain your event handlers, other "game" logic, and an instance of your composite shape!
    private House _house;
    private Label _label;

    public Cartoon(Pane housePane, HBox buttonPane) {
        _house = new House(housePane);
        this.setupBottomPane(buttonPane);
        this.setupTimeline();
    }

    public void setupBottomPane(HBox buttonPane) {
        Button b1 = new Button("Quit");
        b1.setOnAction(new QuitHandler());
        buttonPane.getChildren().addAll(b1,_label);
    }

    public void setupTimeline() {
        KeyFrame frame1 = new KeyFrame(Duration.seconds(1), new MoveHandler());
        Timeline timeline = new Timeline(frame1);
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    private class MoveHandler implements EventHandler<ActionEvent> {

        public void MoveHandler() {
            if(_house.getXLoc() > Constants.SCENE_WIDTH) {
                _label = new Label("Hurry up and change my paint!");
            } else _label = new Label("Press 'P' to change my paint color");
        }
        public void handle(ActionEvent event) {
            if(_house.getXLoc() < Constants.SCENE_WIDTH) {
                _house.setLocation(_house.getXLoc() + 20, _house.getYLoc() + 0);
            } else _house.setLocation(Constants.HOUSE_X_LOC, Constants.HOUSE_Y_LOC);
        }
    }

    private class QuitHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent event) {
            System.exit(0);
        }
    }

}
