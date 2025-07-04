public class Programador extends Empleado {
        private String rol;
public Programador(String nombre, String apellido, int edad, String rol) {
    super(nombre, apellido, edad);
    this.rol = rol;
}
public String getRol() {
    return rol; 
}
@Override
    public void trabajar() { 
        System.out.println("programando");
    }
     public void mostrarDatos() { 
        System.out.println("el nombre del programador es " + this.getNombre());
        System.out.println("el apellido es " + this.getApellido());
        System.out.println("su edad es " + this.getEdad());
        System.out.println("su rol es" + this.getRol());
    }
}
