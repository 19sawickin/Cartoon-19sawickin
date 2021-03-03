package cartoon;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * In this cartoon, a house composite shape is constructed and moves across
 * the screen from left to right. Users can press "R" to change the house color
 * to red, "G" to change the house color to green, or "B" to change the house
 * color to blue. At the bottom of the screen there is a "Quit" button as well
 * as a label that reads "change my paint color" when the house is on the left
 * half of the scene, then changes to "hurry up and change my paint color!" when
 * the house is on the right half of the screen. Once the house exits the right
 * edge of the screen, it wraps back around to the left side with the same paint
 * color as before.
 */

/**
 * The App class sets up the GUI by first instantiating the Pane Organizer which
 * organizes all of the panes, then creates a scene in which the root node is
 * passed in as a parameter. Finally, the stage is told to show the scene.
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        PaneOrganizer organizer = new PaneOrganizer();
        Scene scene = new Scene(organizer.getRoot(), Constants.SCENE_WIDTH, Constants.SCENE_HEIGHT);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] argv) {
        launch(argv);
    }
}
