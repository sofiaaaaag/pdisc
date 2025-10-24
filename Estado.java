package semaforo;

import javafx.scene.paint.Color;

public interface Estado {
    Estado cambiarEstado();
    Color getColor();
}
