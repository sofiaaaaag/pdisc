import io.javalin.Javalin;
import java.util.Map;
public class Main {
public static void main(String[] args) {
    Javalin app = Javalin.create().start(8080);
app.get("/saludo/:nombre/:apellido", ctx -> {
    String nombre = ctx.pathParam("nombre");
    String apellido = ctx.pathParam("apellido");
    ctx.json(Map.of("mensaje","Hola," + nombre + apellido));
});
}
}
