import java.awt.Color;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ChangeCircleColorWithMouse extends Application {
    private CirclePane circlePane = new circlePane();

    @Override
    public void start(Stage primaryStage) {

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        circlePane.setOnMousePressed(Color.BLACK);
        circlePane.setOnMouseReleased(Color.WHITE);

        Scene scene = new Scene(pane, 300, 100);
        primaryStage.setTitle("ChangeCircleColorWithMouse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}

