import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tarea011_015 {

    static LocalDateTime obtenerFechaHoraActual() {
        return LocalDateTime.now();
    }

    static String formatearFecha(LocalDateTime momento) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH);
        return momento.format(formato);
    }

    static String formatearHora(LocalDateTime momento) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH);
        return momento.format(formato).toLowerCase();
    }

    static void mostrarResultado(String fecha, String hora) {
        System.out.println("Fecha y hora actual :");
        System.out.println(fecha);
        System.out.println(hora);
    }

    public static void main(String[] args) {
        LocalDateTime ahora = obtenerFechaHoraActual();
        mostrarResultado(formatearFecha(ahora), formatearHora(ahora));
    }
}
