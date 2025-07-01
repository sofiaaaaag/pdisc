public class Pelicula{
    private String nombre;
    private String director;
    private int duracion;
    //hago q este muestre los tres argumentos
   public Pelicula(String nombre, String director, int duracion){
       this.nombre = nombre;
       this.director = director;
       this.duracion = duracion;
   }
   //este no muestra ningun argumento con datos
   public Pelicula(){
       this.nombre = "";
       this.director = "";
       this.duracion = 0;
   }    
   //a este le paso el parametro nombre para q solo se muestre el argumento nombre    
   public Pelicula(String nombre){
       this.nombre = nombre;
       this.director = "";
       this.duracion = 0;
   } 
    //a este le paso el parametro director y duracion para q solo se muestre el argumento director y duracion
    public Pelicula(String director, int duracion){
        this.nombre = "";
        this.director = director;
        this.duracion = duracion;
    }
    public void mostrarInfo(){
        System.out.println("el nombre de la pelicula es " + nombre);
        System.out.println("su director es " + director);
        System.out.println("y dura " + duracion + " minutos");
    }
    public String getNombre(){
        return nombre;
    }
    public String getDirector(){
        return director;
    }
    public int getDuracion(){
        return duracion;
    }     

}