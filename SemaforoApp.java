package semaforo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.geometry.Pos;

public class SemaforoApp extends Application {

    @Override
    public void start(Stage stage) {
        Semaforo semaforo = new Semaforo();

        Circle luz = new Circle(80);
        luz.setFill(semaforo.getColorActual());

        Button boton = new Button("Cambiar estado");
        boton.setOnAction(e -> {
            semaforo.cambiarEstado();
            luz.setFill(semaforo.getColorActual());
        });

        VBox root = new VBox(20, luz, boton);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 300, 300);
        stage.setScene(scene);
        stage.setTitle("Semáforo");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
