
// tarea para pdsic: crear un objeto de la clase objeto de la clase alumno que tenga como atributo nombre y como metodo que muestra el promedio entre float nota1 y float nota2 y subilo al repositrio pdisc
public class Alumno //creo una clase del objeto Alumno
{
    private String nombre; //declaro los atributos 
    private float nota1;
    private float nota2;
    public int Promedio(){ //creo el metodo promedio que retorna un int de las notas divididas por dos
        return (int)((nota1 + nota2)/2);
    }
    public static void main (String[] args) {
        Alumno alumno = new Alumno(); //creo el objeto de la clase de alumno
        alumno.nombre ="Sofia"; //le asigno los valores a los atributos de nombre y notas
        alumno.nota1 = 10;
        alumno.nota2 = 8;
        System.out.println("El promedio de "+ alumno.nombre + " es " + alumno.Promedio()); //imprimo el promedio
    }
}       