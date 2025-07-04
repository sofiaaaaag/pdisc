public class Diseñador extends Empleado {
            private String programa;
public Diseñador(String nombre, String apellido, int edad, String programa) {
    super(nombre, apellido, edad);
    this.programa = programa;
}
public String getPrograma() {
    return programa;
}
@Override
    public void trabajar() { 
        System.out.println("diseñando");
    }
     public void mostrarDatos() { 
        System.out.println("el nombre del diseñador es " + this.getNombre());
        System.out.println("el apellido es " + this.getApellido());
        System.out.println("su edad es " + this.getEdad());
        System.out.println("el programa que usa es" + this.getPrograma());
    }
}
