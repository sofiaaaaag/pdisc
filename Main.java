public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0]= new Camion("abc", 2015, "pepe", 1000);
        vehiculos[1]= new Moto("dfg", 2018, "francisco", 250);
        vehiculos[2]= new Auto("hjk", 2021, "lucas", 4);
        
        for(Vehiculo v : vehiculos) {
            v.mostrarDatos();
            System.out.println("Patente: " + v.patente);
            System.out.println("Año: " + v.año);
            System.out.println("Dueño: " + v.dueño);
            System.out.println("Impuestos: $" + v.calcularImpuestos());
        }
    }
}
