public class Editable implements Estado {

    @Override
    public void escribir(Documento doc, String texto) {
        doc.setContenido(doc.getContenido() + texto);
        doc.setModificado(true);
        System.out.println("se modifico  el documento");
    }

    @Override
    public void guardar(Documento doc) {
        if (doc.estaModificado()) {
            System.out.println("se guardo el documento");
            doc.setModificado(false);
        } 
    }
}
