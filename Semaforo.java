package semaforo;

import javafx.scene.paint.Color;

public class Semaforo {
    private Estado estado;

    public Semaforo() {
        estado = new Rojo();
    }

    public void cambiarEstado() {
        estado = estado.cambiarEstado();
    }

    public Color getColorActual() {
        return estado.getColor();
    }
}
