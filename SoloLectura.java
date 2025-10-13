public class SoloLectura implements Estado {

    @Override
    public void escribir(Documento doc, String texto) {
        System.out.println("no se puede escribir, solo  lectura");
    }

    @Override
    public void guardar(Documento doc) {
        System.out.println("no  se puede guardar");
    }
}
