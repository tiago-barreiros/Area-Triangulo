package areaTriangulo;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("Área do Triângulo");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args designed without arguments.
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}