package cartoon;

import javafx.scene.layout.*;
import javafx.scene.control.*;

public class PaneOrganizer {
    //TODO: use this class to set up your panes, your quit button, and to create an instance of your top-level logic class!
    private BorderPane _root;
    private House _house;
    private Label _label;

    public PaneOrganizer() {
        _root = new BorderPane();
        Pane housePane = new Pane();
        _root.setCenter(housePane);
        HBox buttonPane = new HBox();
        _root.setBottom(buttonPane);
        new HouseMover(housePane, buttonPane);
    }

    public BorderPane getRoot() {
        return _root;
    }
}