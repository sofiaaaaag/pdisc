public class Gerente extends Empleado {
    private int sueldo;
public Gerente(String nombre, String apellido, int edad, int sueldo) {
    super(nombre, apellido, edad);
    this.sueldo = sueldo;
}

public int getSueldo() {
    return sueldo;
}
@Override
    public void trabajar() { 
        System.out.println("trabajando");
    }
     public void mostrarDatos() { 
        System.out.println("el nombre del Gerente es " + this.getNombre());
        System.out.println("el apellido es " + this.getApellido());
        System.out.println("su edad es " + this.getEdad());
        System.out.println("su sueldo es de" + this.getSueldo());
    }
       
}

