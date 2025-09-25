public class Main {
    public static void main(String[] args) {
        App app = new App();
        Modo modo = new Modo();
        MercadoPago mercadoPago = new MercadoPago();
        AdaptadorMetodo adaptadorMetodo = new AdaptadorMetodo(app);
        adaptadorMetodo.pagar(100, 1);        
        modo.pagar(100, 1);        
        mercadoPago.pagar(100, 1);
    }
}