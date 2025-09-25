public class AdaptadorMetodo implements MetodoPago {
    private App app;

    public AdaptadorMetodo(App app){
        this.app = app;
    }
    @Override
    public void pagar(int monto, int idUsuario) {
        app.pagar(monto, idUsuario);
    }
}
