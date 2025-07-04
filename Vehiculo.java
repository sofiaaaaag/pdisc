public abstract class Vehiculo {
    protected String patente;
    protected int año;
    protected String dueño;

    public Vehiculo(String patente,int año,String dueño) {
        this.patente = patente;
        this.año = año;
        this.dueño = dueño;
    } 
     public void buscarVehiculo( int año, String dueño) {
    }
    public void mostrarDatos() {
    }
     public abstract double calcularImpuestos();
}