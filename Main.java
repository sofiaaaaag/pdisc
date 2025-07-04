public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0]= new Gerente("pedro", "ramirez", 10, 4000);
        empleados[1]= new Diseñador("felipe", "rojas", 12, " figma");
        empleados[2]= new Programador("javier", "lopez", 8, " backend");

        for (Empleado empleado : empleados) {
            empleado.trabajar();
            empleado.mostrarDatos();
        }

}
}