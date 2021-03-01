package cartoon;

import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class HouseMover {
    private House _house;

    public HouseMover(Pane housePane, HBox buttonPane) {
        _house = new House(housePane);
    }


}
