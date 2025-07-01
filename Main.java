
public class Main {
    public static void main(String[] args){
        Pelicula peliculaNueva = new Pelicula("la la land", "damien chazelle", 100);
        peliculaNueva.mostrarInfo();
    
        Pelicula pelicula1 = new Pelicula("la la land", "damien chazelle", 100);
        Pelicula pelicula2 = new Pelicula();
        Pelicula pelicula3 = new Pelicula("whiplash");
        Pelicula pelicula4 = new Pelicula("damien chazelle", 120);

        System.out.println("la pelicula 1:");
            pelicula1.mostrarInfo();
        System.out.println("la pelicula 2:");
            pelicula2.mostrarInfo();
        System.out.println("la pelicula 3:");
            pelicula3.mostrarInfo();
        System.out.println("la pelicula 4:");
            pelicula4.mostrarInfo();
    }
}

