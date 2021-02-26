package cartoon;

import javafx.scene.layout.*;
import javafx.scene.control.*;

public class PaneOrganizer {
    //TODO: use this class to set up your panes, your quit button, and to create an instance of your top-level logic class!
    private VBox _root;
    //private House _house;
    private Label _label;

    public PaneOrganizer() {
        _root = new VBox();
        //_house = new House();
        //_root.getChildren().add(_house);
        _label = new Label("Start");
        _root.getChildren().add(_label);

    }

    public VBox getRoot() {
        return _root;
    }
}
