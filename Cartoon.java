package cartoon;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Cartoon {
    // TODO: this is your top-level logic class! It should contain your event handlers, other "game" logic, and an instance of your composite shape!
    private House _house;

    public Cartoon(Pane housePane, HBox buttonPane) {
        _house = new House(housePane);
        this.setupButtons(buttonPane);
    }

    public void setupButtons(HBox buttonPane) {
        Button b1 = new Button("Stop");
        Button b2 = new Button("Change Color");
        Button b3 = new Button("Quit");
        buttonPane.getChildren().addAll(b1,b2,b3);
    }

    public void setupTimeline() {
        KeyFrame kf = new KeyFrame(Duration.seconds(1), new ButtonHandler());
        Timeline timeline = new Timeline(kf);
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    private class ButtonHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent event) {

        }
    }

}
