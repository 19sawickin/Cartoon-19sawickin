package cartoon;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class PaneOrganizer {
    //TODO: use this class to set up your panes, your quit button, and to create an instance of your top-level logic class!
    private BorderPane _root;

    public PaneOrganizer() {
        _root = new BorderPane();
        Pane housePane = new Pane();
        _root.setCenter(housePane);
        HBox bottomPane = new HBox();
        this.setupBottom(bottomPane);
        _root.setBottom(bottomPane);
        new Cartoon(housePane, bottomPane);
    }

    public BorderPane getRoot() {
        return _root;
    }

    public void setupBottom(HBox bottomPane) {
        Button b1 = new Button("Quit");
        b1.setOnAction(new QuitHandler());
        bottomPane.getChildren().addAll(b1);
    }

    private class QuitHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent event) {
            System.exit(0);
        }
    }
}