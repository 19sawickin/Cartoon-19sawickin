package cartoon;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.*;
import javafx.util.Duration;

public class Cartoon {
    // TODO: this is your top-level logic class! It should contain your event handlers, other "game" logic, and an instance of your composite shape!
    public Cartoon() {


    }

    public void setupTimeline() {
        KeyFrame kf = new KeyFrame(Duration.seconds(1), new TimeHandler());
        Timeline timeline = new Timeline(kf);
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    private class TimeHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent event) {

        }
    }
    
}
