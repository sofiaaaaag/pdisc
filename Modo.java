public class Modo implements MetodoPago {
    @Override
    public void pagar(int monto, int idUsuario) {
        System.out.println("Pago realizado con modo");
    }
}