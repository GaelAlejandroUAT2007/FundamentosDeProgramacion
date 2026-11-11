package a2253332351_puntodeventa2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class puntodeventa_2 {

    private static final BufferedReader LECTURA = new BufferedReader(new InputStreamReader(System.in));

    public static String Dialogo(String texto) throws IOException {
        System.out.println(texto + " : ");
        String cadena = LECTURA.readLine();
        if (cadena == null) {
            System.out.println("Fin de la entrada, saliendo del sistema.");
            System.exit(0);
        }
        return cadena;
    }

    public static String Leer(String texto) throws IOException {
        String cadena = Dialogo(texto);
        if (cadena != null) {
            cadena = cadena.trim();
            if (cadena.isEmpty())
                cadena = null;
        }
        return cadena;
    }

    public static String MostrarMenu(String[] opciones) {
        String cadena = "";
        int i = 0;
        while (i < opciones.length) {
            cadena += (i + 1) + ". " + opciones[i] + "\n";
            i++;
        }
        return cadena;
    }

    public static String DesplegarMenu(String titulo, String[] menu) throws IOException {
        String cadena = "=====================================\n";
        cadena = cadena + titulo + "\n";
        cadena = cadena + "=====================================\n";
        cadena = cadena + MostrarMenu(menu);
        cadena = cadena + "\n Que opcion deseas ";
        return Leer(cadena);
    }

    public static String Fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatodia = new SimpleDateFormat("dd-MM-yyyy");
        return formatodia.format(fecha);
    }

    public static String IdTicketSiguiente(String idticket) {
        String idticketnext = "";
        int num = Integer.parseInt(idticket) + 1;
        if (num < 10) {
            idticketnext = "00" + String.valueOf(num).trim();
        } else if ((num > 9) && (num < 100)) {
            idticketnext = "0" + String.valueOf(num).trim();
        } else {
            idticketnext = String.valueOf(num).trim();
        }
        return idticketnext;
    }

    public static void MenuCategorias() throws IOException {
        String[] datosmenu = { "Alta de Categorias", "Modificacion de Categorias", "Listado de Categorias", "Salida" };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("GESTION DE CATEGORIAS", datosmenu);
            if (opcion == null)
                System.out.println("opcion incorrecta ");
            else
                switch (opcion) {
                    case "1": System.out.println("Alta de Categorias "); break;
                    case "2": System.out.println("Modificacion de Categorias "); break;
                    case "3": System.out.println("Listado de Categorias "); break;
                    case "4": System.out.println("Salida de Gestion de Categorias "); break;
                    default: System.out.println("No existe esta opcion "); break;
                }
        } while (!"4".equals(opcion));
    }

    public static void MenuProductos() throws IOException {
        String[] datosmenu = { "Agregar Producto", "Modificar Producto", "Listado de Productos", "Salida" };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("GESTION DE PRODUCTOS", datosmenu);
            if (opcion == null)
                System.out.println("opcion incorrecta ");
            else
                switch (opcion) {
                    case "1": System.out.println("Agregar Producto "); break;
                    case "2": System.out.println("Modificar Producto "); break;
                    case "3": System.out.println("Listado de Productos "); break;
                    case "4": System.out.println("Salida de Gestion de Productos "); break;
                    default: System.out.println("No existe esta opcion "); break;
                }
        } while (!"4".equals(opcion));
    }

    public static void MenuInventario() throws IOException {
        String[] datosmenu = { "Agregar Stock (Entrada de Almacen)", "Ajustar/Eliminar Stock (Salida/Baja)", "Listado de Inventario", "Salida" };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("GESTION DE INVENTARIOS", datosmenu);
            if (opcion == null)
                System.out.println("opcion incorrecta ");
            else
                switch (opcion) {
                    case "1": System.out.println("Agregar Stock (Entrada de Almacen) "); break;
                    case "2": System.out.println("Ajustar/Eliminar Stock (Salida/Baja) "); break;
                    case "3": System.out.println("Listado de Inventario "); break;
                    case "4": System.out.println("Salida de Gestion de Inventarios "); break;
                    default: System.out.println("No existe esta opcion "); break;
                }
        } while (!"4".equals(opcion));
    }

    public static void MenuReportes() throws IOException {
        String[] datosmenu = { "Reporte de Ventas (Corte de Caja)", "Reporte de Productos Mas Vendidos", "Reporte de Valor de Inventario", "Reporte de Impuestos Cobrados", "Reporte de Devoluciones", "Salida" };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("MODULO DE REPORTES", datosmenu);
            if (opcion == null)
                System.out.println("opcion incorrecta ");
            else
                switch (opcion) {
                    case "1": System.out.println("Reporte de Ventas (Corte de Caja) "); break;
                    case "2": System.out.println("Reporte de Productos Mas Vendidos "); break;
                    case "3": System.out.println("Reporte de Valor de Inventario "); break;
                    case "4": System.out.println("Reporte de Impuestos Cobrados "); break;
                    case "5": System.out.println("Reporte de Devoluciones "); break;
                    case "6": System.out.println("Salida de Modulo de Reportes "); break;
                    default: System.out.println("No existe esta opcion "); break;
                }
        } while (!"6".equals(opcion));
    }

    public static void MenuImpuestos() throws IOException {
        String[] datosmenu = { "Alta de Impuesto", "Modificacion de Impuesto", "Listado de Impuestos", "Asignar Impuestos a Categorias", "Salida" };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("GESTION DE IMPUESTOS", datosmenu);
            if (opcion == null)
                System.out.println("opcion incorrecta ");
            else
                switch (opcion) {
                    case "1": System.out.println("Alta de Impuesto "); break;
                    case "2": System.out.println("Modificacion de Impuesto "); break;
                    case "3": System.out.println("Listado de Impuestos "); break;
                    case "4": System.out.println("Asignar Impuestos a Categorias "); break;
                    case "5": System.out.println("Salida de Gestion de Impuestos "); break;
                    default: System.out.println("No existe esta opcion "); break;
                }
        } while (!"5".equals(opcion));
    }

    public static void MenuDevoluciones() throws IOException {
        String[] datosmenu = { "Realizar Devolucion (Cancelar Ticket Pagado)", "Listado de Devoluciones", "Salida" };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("GESTION DE DEVOLUCIONES", datosmenu);
            if (opcion == null)
                System.out.println("opcion incorrecta ");
            else
                switch (opcion) {
                    case "1": System.out.println("Realizar Devolucion (Cancelar Ticket Pagado) "); break;
                    case "2": System.out.println("Listado de Devoluciones "); break;
                    case "3": System.out.println("Salida de Gestion de Devoluciones "); break;
                    default: System.out.println("No existe esta opcion "); break;
                }
        } while (!"3".equals(opcion));
    }

    public static void MenuProveedores() throws IOException {
        String[] datosmenu = { "Alta de Proveedor", "Modificacion de Proveedor", "Listado de Proveedores", "Salida" };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("GESTION DE PROVEEDORES", datosmenu);
            if (opcion == null)
                System.out.println("opcion incorrecta ");
            else
                switch (opcion) {
                    case "1": System.out.println("Alta de Proveedor "); break;
                    case "2": System.out.println("Modificacion de Proveedor "); break;
                    case "3": System.out.println("Listado de Proveedores "); break;
                    case "4": System.out.println("Salida de Gestion de Proveedores "); break;
                    default: System.out.println("No existe esta opcion "); break;
                }
        } while (!"4".equals(opcion));
    }

    public static void MenuPuntoVenta(String idticket) throws IOException {
        String opcion, membrete;
        idticket = IdTicketSiguiente(idticket);
        membrete = "PUNTO DE VENTA\nTicket del dia: " + idticket + "\nFecha: " + Fecha();
        String[] datosmenu = { "Agregar Producto", "Eliminar Producto", "Pagar Ticket", "Cancelar Venta (Salir)" };
        do {
            opcion = DesplegarMenu(membrete, datosmenu);
            if (opcion == null)
                System.out.println("opcion incorrecta ");
            else
                switch (opcion) {
                    case "1": System.out.println("Agregar Producto al Ticket "); break;
                    case "2": System.out.println("Eliminar Producto del Ticket "); break;
                    case "3": System.out.println("Pagar Ticket "); break;
                    case "4": System.out.println("Cancelar Venta, salida del Punto de Venta "); break;
                    default: System.out.println("No existe esta opcion "); break;
                }
        } while (!"3".equals(opcion) && !"4".equals(opcion));
    }

    public static void MenuPrincipal() throws IOException {
        String[] datosmenuprincipal = { "Categorias", "Productos", "Punto de Venta", "Inventario",
                "Ventas y Reportes", "Gestion de Impuestos", "Devoluciones", "Proveedores", "Salida" };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("TIENDA DE ABARROTES LA PEQUENA", datosmenuprincipal);
            if (opcion == null)
                System.out.println("opcion incorrecta ");
            else
                switch (opcion) {
                    case "1": MenuCategorias(); break;
                    case "2": MenuProductos(); break;
                    case "3": MenuPuntoVenta("000"); break;
                    case "4": MenuInventario(); break;
                    case "5": MenuReportes(); break;
                    case "6": MenuImpuestos(); break;
                    case "7": MenuDevoluciones(); break;
                    case "8": MenuProveedores(); break;
                    case "9": System.out.println("Salida del Sistema "); break;
                    default: System.out.println("No existe esta opcion "); break;
                }
        } while (!"9".equals(opcion));
    }

    public static void main(String[] args) throws IOException {
        MenuPrincipal();
    }
}
