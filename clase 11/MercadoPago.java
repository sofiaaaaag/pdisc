public class MercadoPago implements MetodoPago {
    @Override
    public void pagar(int monto, int idUsuario) {
        System.out.println("Pago realizado con MercadoPago");
    }
}