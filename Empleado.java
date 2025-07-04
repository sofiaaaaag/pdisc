//tarea para pdisc: Crear jerarquía Empleado Gerente, Programador, Diseñador Todos deben sobrescribir trabajar() y mostrarDatos() crear array de empleados y recorrerlo invocando métodos polimórficos
public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;

    public Empleado(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
        public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void trabajar() {
        
    }
     public void mostrarDatos() {
        
    }
}
