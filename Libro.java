public class Libro{ 
    private String titulo;
    private String autor;

public Libro(String titulo, String autor){
    this.titulo = titulo;
    this.autor = autor;
}
public void mostrarInfo(){
    System.out.println(titulo + " de " + autor);
}
public String gettitulo(){
    return titulo;
}
public void settitulo(String titulo){
    this.titulo = titulo;
}
public String getautor(){
    return autor;
}
public void setautor(String autor){
    this.autor = autor;
}
public Libro(){ //Constructor vacio
   
}
public static void main(String[] args) {
    Libro libro = new Libro("El libro de sofia", "Sofia");
  /*   this.titulo = "El libro de sofia";
    this.autor ="Sofia"; */
    libro.mostrarInfo();
}
}


