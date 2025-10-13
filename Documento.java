public class Documento {
    private Estado estado;
    private String contenido;
    private boolean modificado;
    public Documento() {
        this.estado = new SoloLectura(); 
        this.contenido = "";
     this.modificado = false;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public void escribir(String texto) {
        estado.escribir(this, texto);
    }
    public void guardar() {
        estado.guardar(this);
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public boolean estaModificado() {
        return modificado;
    }
    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }
}
