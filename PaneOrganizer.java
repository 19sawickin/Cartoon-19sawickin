package cartoon;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;
import javafx.scene.control.*;

/**
 * The PaneOrganizer class is responsible for setting up and keeping all of the panes organized
 * in one location. The root node is also set up here which is a BorderPane that contains
 * housePane which has the composite shape in it, as well as the bottomPane which contains the
 * "Quit" button and the timeline-dependent label. The bottomPane is set to the bottom of the
 * BorderPane.
 */
public class PaneOrganizer {

    private BorderPane _root;

    /**
     * The PaneOrganizer constructor is responsible for creating the BorderPane root node,
     * putting in the center of it the composite shape's pane, and putting the quit button
     * and label that are both in the bottomPane into the bottom of the BorderPane. An
     * instance of my top-level logic class "Cartoon" is also constructed here.
     */
    public PaneOrganizer() {
        _root = new BorderPane();
        Pane housePane = new Pane();
        _root.setCenter(housePane);
        HBox bottomPane = new HBox();
        this.setupBottom(bottomPane);
        _root.setBottom(bottomPane);
        new Cartoon(housePane, bottomPane);
    }

    /**
     * This method returns the BorderPane root node.
     */
    public BorderPane getRoot() {
        return _root;
    }

    /**
     * This method creates the quit button and adds it to bottomPane.
     */
    public void setupBottom(HBox bottomPane) {
        Button b1 = new Button("Quit");
        b1.setOnAction(new QuitHandler());
        bottomPane.getChildren().addAll(b1);
    }

    /**
     * This private class is responsible for quitting the scene when the button is
     * pressed.
     */
    private class QuitHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent event) {
            System.exit(0);
        }
    }
}