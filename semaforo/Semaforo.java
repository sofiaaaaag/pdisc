public class Semaforo {
    private Estado estado;
    public Semaforo() {
        estado = new  Rojo();
    }
    public void cambiarEstado() {
        estado.cambiarEstado(this);
    }
    public void cambiarEstado(Estado estado) {
        this.estado = estado;
    }
    public Estado getEstado() {
        return estado;
    }
  
}
