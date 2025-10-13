public class Main {
    public static void main(String[] args) {
        Documento doc = new Documento();

        System.out.println("escribirndo en el docuemnto...(holi)");
        doc.escribir("holi");
        doc.guardar();
        System.out.println("(cambiando el  estado a editable)");
        doc.setEstado(new Editable());
        doc.escribir("holii");
        doc.guardar();
        System.out.println("(guardando el documento)");
        doc.guardar();
        System.out.println("(cambiando el estado a solo lectura)");
        doc.setEstado(new SoloLectura());
        doc.escribir("no se puede escribir");
        doc.guardar();
        System.out.println("documento:");
        System.out.println(doc.getContenido());
    }
}
