package a2253332351_estudiodecaso;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Capitulo7 {

    static String[][] productos;
    static String[][] ventas;
    static int tamventas = 100;
    static final int TAM_TICKET = 50;
    static final double IVA = 0.16;
    static final BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static String MostrarMenu(String[] opciones) {
        String cadena = "";
        for (String info : opciones) {
            cadena = cadena + info + "\n";
        }
        return cadena;
    }

    public static String Dialogo(String texto) throws IOException {
        System.out.println(texto + " : ");
        return lectura.readLine();
    }

    public static String DesplegarMenu(String titulo, String[] menu) throws IOException {
        String cadena = titulo + "\n\n";
        cadena = cadena + MostrarMenu(menu);
        cadena = cadena + "\n Que opcion deseas ";
        String opcion = Dialogo(cadena);
        return opcion == null ? null : opcion.trim();
    }

    public static String Leer(String texto) throws IOException {
        String cadena = Dialogo(texto);
        if (cadena != null) {
            cadena = cadena.trim();
            if (cadena.isEmpty()) {
                cadena = null;
            }
        }
        return cadena;
    }

    public static boolean EsNumeroEntero(String dato) {
        if (dato == null || dato.isEmpty()) {
            return false;
        }
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean EsNumeroDouble(String dato) {
        if (dato == null || dato.isEmpty()) {
            return false;
        }
        boolean punto = false;
        boolean hayDigito = false;
        for (char c : dato.toCharArray()) {
            if (Character.isDigit(c)) {
                hayDigito = true;
            } else if (c == '.' && !punto) {
                punto = true;
            } else {
                return false;
            }
        }
        return hayDigito;
    }

    public static boolean EvaluarNumerico(String dato, int tipo) {
        boolean valido = false;
        switch (tipo) {
            case 1:
                valido = EsNumeroEntero(dato);
                break;
            case 2:
                valido = EsNumeroDouble(dato);
                break;
        }
        return valido;
    }

    public static String RellenarEspacios(String dato, int tamano) {
        return String.format("%1$-" + tamano + "s", dato);
    }

    public static String IdTicketSiguiente(String idticket) {
        int num = Integer.parseInt(idticket) + 1;
        if (num < 10) {
            return "00" + num;
        } else if (num < 100) {
            return "0" + num;
        }
        return String.valueOf(num);
    }

    public static int ObtenerUltimaPosicion(String[][] matriz) {
        int ultimaPosicion = -1;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] != null && !matriz[i][0].isEmpty()) {
                ultimaPosicion = i;
            }
        }
        return ultimaPosicion;
    }

    public static String Fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatodia = new SimpleDateFormat("dd-MM-yyyy");
        return formatodia.format(fecha);
    }

    public static String[][] CargarProductos() {
        String[][] producto = {
            {"001", "Arroz 1kg", "35", "10"},
            {"002", "Azúcar 1kg", "25", "10"},
            {"003", "Harina 1kg", "28", "10"},
            {"004", "Aceite 1L", "50", "10"},
            {"005", "Leche 1L", "35", "10"},
            {"006", "Huevos 12 unidades", "45", "10"},
            {"007", "Fideos 500g", "20", "10"},
            {"008", "Sal 1kg", "15", "10"},
            {"009", "Pasta de tomate 400g", "25", "10"},
            {"010", "Atún lata 170g", "35", "10"}
        };
        return producto;
    }

    public static String MostrarProducto(String[] vproducto) {
        String codigo = RellenarEspacios(vproducto[0], 5);
        String producto = RellenarEspacios(vproducto[1], 30);
        String precio = RellenarEspacios(vproducto[2], 10);
        String cantidad = RellenarEspacios(vproducto[3], 10);
        return codigo.concat(producto + precio + cantidad);
    }

    public static String MostrarLista(String[][] vproductos) {
        String salida = "";
        for (int ciclo = 0; ciclo < vproductos.length; ciclo++) {
            salida = salida.concat(MostrarProducto(vproductos[ciclo]) + "\n");
        }
        return salida;
    }

    public static int ExisteProducto(String codigo, String[][] vproductos) {
        for (int ciclo = 0; ciclo < vproductos.length; ciclo++) {
            if (vproductos[ciclo][0].compareTo(codigo.trim()) == 0) {
                return ciclo;
            }
        }
        return -1;
    }

    public static void ModificarProducto(String[][] vproductos) throws IOException {
        String info = MostrarLista(vproductos);
        String codigo = Leer(info + "\nIntroduce el codigo del producto a modificar");
        if (codigo == null) {
            System.out.println("dato nulo");
            return;
        }
        int posicion = ExisteProducto(codigo, vproductos);
        if (posicion < 0) {
            System.out.println("no existe el codigo");
            return;
        }
        String precio = Leer("\nIntroduce el precio de " + MostrarProducto(vproductos[posicion]) + " ");
        if (precio == null) {
            System.out.println("dato nulo");
        } else if (EvaluarNumerico(precio, 2) || EvaluarNumerico(precio, 1)) {
            vproductos[posicion][2] = precio;
        } else {
            System.out.println("no es un valor numerico");
        }
    }

    public static void MenuProductos(String[][] vproductos) throws IOException {
        String[] datosmenuproductos = {"1.-Modificar ", "2.-Listado ", "3.-Salida "};
        String opcion;
        do {
            opcion = DesplegarMenu("Opciones de Productos", datosmenuproductos);
            if (opcion == null) {
                opcion = "3";
            }
            switch (opcion) {
                case "1": ModificarProducto(vproductos); break;
                case "2": System.out.println(MostrarLista(vproductos)); break;
                case "3": System.out.println("Salida de Productos "); break;
                default: System.out.println("No existe esta opcion "); break;
            }
        } while (!opcion.equals("3"));
    }

    public static void AgregarStock(String[][] vproductos) throws IOException {
        String info = MostrarLista(vproductos);
        String codigo = Leer(info + "\nIntroduce el codigo del producto a modificar");
        if (codigo == null) {
            System.out.println("dato nulo");
            return;
        }
        int posicion = ExisteProducto(codigo, vproductos);
        if (posicion < 0) {
            System.out.println("no existe el codigo");
            return;
        }
        String cantidad = Leer("\nIntroduce la Cantidad de Stock a Agregar de "
                + MostrarProducto(vproductos[posicion]) + " ");
        if (cantidad == null) {
            System.out.println("dato nulo");
        } else if (EvaluarNumerico(cantidad, 1)) {
            int nueva = Integer.parseInt(cantidad) + Integer.parseInt(vproductos[posicion][3]);
            vproductos[posicion][3] = String.valueOf(nueva);
        } else {
            System.out.println("no es un valor numerico entero");
        }
    }

    public static void MenuInventario(String[][] vproductos) throws IOException {
        String[] datosmenuinventario = {"1.-Listado ", "2.-Agregar ", "3.-Salida "};
        String opcion;
        do {
            opcion = DesplegarMenu("Opciones de Inventarios", datosmenuinventario);
            if (opcion == null) {
                opcion = "3";
            }
            switch (opcion) {
                case "1": System.out.println(MostrarLista(vproductos)); break;
                case "2": AgregarStock(vproductos); break;
                case "3": System.out.println("Salida de Inventario "); break;
                default: System.out.println("No existe esta opcion "); break;
            }
        } while (!opcion.equals("3"));
    }

    public static String[][] CrearVenta() {
        return new String[tamventas][5];
    }

    public static String UltimoTicket(int pos, String[][] mventa) {
        String idticket = "000";
        if (pos > -1) {
            idticket = mventa[pos][0];
        }
        return idticket;
    }

    public static String[][] CrearTicket() {
        return new String[TAM_TICKET][4];
    }

    public static int ExisteTicketCodigo(String[][] mticket, String codigo) {
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++) {
            if (mticket[ciclo][0] != null && mticket[ciclo][0].compareTo(codigo.trim()) == 0) {
                return ciclo;
            }
        }
        return -1;
    }

    public static boolean InsertarProductoTicket(String[][] mticket, String[] datos) {
        int enc = ExisteTicketCodigo(mticket, datos[0]);
        if (enc > -1) {
            int cantidadActual = Integer.parseInt(mticket[enc][3]);
            mticket[enc][3] = String.valueOf(cantidadActual + Integer.parseInt(datos[3]));
            return true;
        }
        int posticket = ObtenerUltimaPosicion(mticket);
        if (posticket + 1 < mticket.length) {
            posticket++;
            mticket[posticket][0] = datos[0];
            mticket[posticket][1] = datos[1];
            mticket[posticket][2] = datos[2];
            mticket[posticket][3] = datos[3];
            return true;
        }
        return false;
    }

    public static String TotalProducto(String precio, String cantidad) {
        double total = Double.parseDouble(precio) * Double.parseDouble(cantidad);
        return String.format(Locale.US, "%.2f", total);
    }

    public static String MostrarProductoTicket(String[][] mticket, int pos) {
        String codigo = RellenarEspacios(mticket[pos][0], 5);
        String producto = RellenarEspacios(mticket[pos][1], 30);
        String precio = RellenarEspacios(mticket[pos][2], 10);
        String cantidad = RellenarEspacios(mticket[pos][3], 5);
        String totalproducto = RellenarEspacios(TotalProducto(mticket[pos][2], mticket[pos][3]), 10);
        return codigo.concat(producto + precio + cantidad + totalproducto);
    }

    public static String MostrarTicket(String[][] mticket) {
        String salida = "";
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++) {
            salida = salida.concat(MostrarProductoTicket(mticket, ciclo) + "\n");
        }
        return salida;
    }

    public static double SubTotalTicket(String[][] mticket) {
        double subtotal = 0;
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++) {
            subtotal = subtotal + Double.parseDouble(TotalProducto(mticket[ciclo][2], mticket[ciclo][3]));
        }
        return subtotal;
    }

    public static double IvaTicket(String[][] mticket) {
        double subtotal = SubTotalTicket(mticket);
        if (subtotal > 0) {
            return IVA * subtotal;
        }
        return 0;
    }

    public static double TotalTicket(String[][] mticket) {
        double total = SubTotalTicket(mticket);
        if (total > 0) {
            total = IvaTicket(mticket) + total;
        }
        return total;
    }

    public static String MostrarTicketVenta(String[][] mticket, String idticket, String fecha) {
        String subtotal = String.format(Locale.US, "%.2f", SubTotalTicket(mticket));
        String iva = String.format(Locale.US, "%.2f", IvaTicket(mticket));
        String total = String.format(Locale.US, "%.2f", TotalTicket(mticket));
        String salida = "Fecha " + fecha + "  Ticket No." + idticket;
        salida = salida + "\n" + MostrarTicket(mticket);
        salida = salida + "\n\n El total sin iva " + subtotal;
        salida = salida + "\n el iva total es " + iva;
        salida = salida + "\n el total de la venta fue " + total;
        return salida;
    }

    public static String MostrarListaProductosVenta(String[][] vproductos) {
        String salida = "";
        for (int ciclo = 0; ciclo < vproductos.length; ciclo++) {
            if (Integer.parseInt(vproductos[ciclo][3]) > 0) {
                salida = salida.concat(MostrarProducto(vproductos[ciclo]) + "\n");
            }
        }
        return salida;
    }

    public static void CapturaVentaProducto(String[][] mticket, String[][] mproductos) throws IOException {
        String info = MostrarListaProductosVenta(mproductos);
        String codigo = Leer(info + "\nIntroduce el codigo del producto");
        if (codigo == null) {
            System.out.println("dato nulo\n");
            return;
        }
        int posp = ExisteProducto(codigo, mproductos);
        if (posp < 0) {
            System.out.println("el codigo no existe no se puede agregar\n");
            return;
        }
        int existencia = Integer.parseInt(mproductos[posp][3]);
        if (existencia <= 0) {
            System.out.println("no hay productos para venta");
            return;
        }
        String[] venta = new String[4];
        venta[0] = mproductos[posp][0];
        venta[1] = mproductos[posp][1];
        venta[2] = mproductos[posp][2];
        venta[3] = "1";
        if (InsertarProductoTicket(mticket, venta)) {
            mproductos[posp][3] = String.valueOf(existencia - 1);
            System.out.println(MostrarProducto(mproductos[posp]));
        } else {
            System.out.println("el Arreglo esta lleno \n");
        }
    }

    public static void RemoverProductoTicket(String[][] mticket, int pos) {
        int ultima = ObtenerUltimaPosicion(mticket);
        for (int i = pos; i < ultima; i++) {
            mticket[i] = mticket[i + 1];
        }
        mticket[ultima] = new String[4];
    }

    public static void EliminarProductoTicket(String[][] mticket, int pos) {
        int cantidad = Integer.parseInt(mticket[pos][3]);
        if (cantidad > 1) {
            mticket[pos][3] = String.valueOf(cantidad - 1);
        } else {
            RemoverProductoTicket(mticket, pos);
        }
    }

    public static void Eliminar(String[][] mticket, String[][] mproductos) throws IOException {
        String info = MostrarTicket(mticket);
        String codigo = Leer(info + "\nIntroduce el codigo del producto");
        if (codigo == null) {
            System.out.println("dato nulo");
            return;
        }
        int pos = ExisteTicketCodigo(mticket, codigo);
        if (pos > -1) {
            int posproducto = ExisteProducto(codigo, mproductos);
            int nuevacantidad = Integer.parseInt(mproductos[posproducto][3]) + 1;
            mproductos[posproducto][3] = String.valueOf(nuevacantidad);
            EliminarProductoTicket(mticket, pos);
        } else {
            System.out.println("el codigo no esta en el ticket");
        }
    }

    public static void AgregarProductoAVenta(String[][] mticket, String[][] mventa, String idticket) {
        int posventas = ObtenerUltimaPosicion(mventa);
        int posticket = ObtenerUltimaPosicion(mticket);
        for (int i = 0; i <= posticket; i++) {
            if (mticket[i][0] != null) {
                posventas++;
                mventa[posventas][0] = idticket;
                mventa[posventas][1] = mticket[i][0];
                mventa[posventas][2] = mticket[i][1];
                mventa[posventas][3] = mticket[i][2];
                mventa[posventas][4] = mticket[i][3];
            }
        }
    }

    public static boolean Pagar(String idticket, String[][] mventa, String[][] mticket) {
        int posventas = ObtenerUltimaPosicion(mventa);
        int posticket = ObtenerUltimaPosicion(mticket);
        if ((posventas + posticket + 2) <= mventa.length) {
            AgregarProductoAVenta(mticket, mventa, idticket);
            return true;
        }
        System.out.println("Desbordamiento de Memoria de ventas");
        return false;
    }

    public static void DevolucionTicket(String[][] mticket, String[][] mproductos) {
        int posticket = ObtenerUltimaPosicion(mticket);
        for (int pos = 0; pos <= posticket; pos++) {
            int posp = ExisteProducto(mticket[pos][0], mproductos);
            if (posp > -1) {
                int cant = Integer.parseInt(mticket[pos][3]) + Integer.parseInt(mproductos[posp][3]);
                mproductos[posp][3] = String.valueOf(cant);
            }
        }
    }

    public static String ObtenerUltimoValorVentas(String[][] mventas) {
        int ultimaposicion = ObtenerUltimaPosicion(mventas);
        String ultimoValor = "000";
        if (ultimaposicion >= 0) {
            ultimoValor = mventas[ultimaposicion][0];
        }
        return ultimoValor;
    }

    public static String MostrarVenta(String[] venta) {
        String idticket = RellenarEspacios(venta[0], 8);
        String codigo = RellenarEspacios(venta[1], 5);
        String producto = RellenarEspacios(venta[2], 30);
        String precio = RellenarEspacios(venta[3], 10);
        String cantidad = RellenarEspacios(venta[4], 10);
        return idticket.concat(codigo + producto + precio + cantidad);
    }

    public static String MostrarListaVentas(String[][] mventas) {
        int posventas = ObtenerUltimaPosicion(mventas);
        String salida = "";
        for (int ciclo = 0; ciclo <= posventas; ciclo++) {
            salida = salida.concat(MostrarVenta(mventas[ciclo]) + "\n");
        }
        return salida;
    }

    public static void MenuPuntoVenta(String[][] mventas, String idticket, String[][] mproductos)
            throws IOException {
        String[][] ticketActual = CrearTicket();
        idticket = IdTicketSiguiente(idticket);
        String fechaDia = Fecha();
        boolean pago = false;
        String opcion;
        String[] datosMenu = {"1.-Agregar", "2.-Eliminar", "3.-Listado", "4.-Pagar", "5.-Salida"};
        String encabezadoBase = "Fecha del Día: " + fechaDia + " | Ticket No: " + idticket + "\n"
                + "-----------------------------------------------------\n";
        do {
            String membrete = encabezadoBase;
            String ticketTexto = MostrarTicket(ticketActual).trim();
            if (!ticketTexto.isEmpty()) {
                membrete = membrete + "\n" + ticketTexto + "\n";
            }
            opcion = DesplegarMenu(membrete + "\n Menu de Punto de Venta", datosMenu);
            if (opcion == null) {
                opcion = "5";
            }
            switch (opcion) {
                case "1":
                    CapturaVentaProducto(ticketActual, mproductos);
                    break;
                case "2":
                    Eliminar(ticketActual, mproductos);
                    break;
                case "3":
                    if (ObtenerUltimaPosicion(ticketActual) > -1) {
                        System.out.println(MostrarTicket(ticketActual));
                    } else {
                        System.out.println("El ticket esta vacio");
                    }
                    break;
                case "4":
                    if (ObtenerUltimaPosicion(ticketActual) == -1) {
                        System.out.println("El ticket esta vacio, no hay nada que pagar");
                    } else if (Pagar(idticket, mventas, ticketActual)) {
                        System.out.println(MostrarTicketVenta(ticketActual, idticket, fechaDia).trim());
                        pago = true;
                        opcion = "5";
                    }
                    break;
                case "5":
                    break;
                default:
                    System.out.println("No existe esta opcion");
                    break;
            }
        } while (!opcion.equals("5"));

        if (!pago && ObtenerUltimaPosicion(ticketActual) > -1) {
            System.out.println("No pago el ticket, se regresan los productos al inventario");
            DevolucionTicket(ticketActual, mproductos);
            System.out.println("eliminando ticket " + idticket);
        }
        System.out.println("Salida de Ventas");
    }

    public static void MenuPrincipal(String[][] vproductos, String[][] vventas) throws IOException {
        String[] datosmenuprincipal = {"1.-Productos ", "2.-Punto de Venta ", "3.-Inventario",
            "4.-Ventas", "5.-Salida "};
        String opcion;
        do {
            String idticket = ObtenerUltimoValorVentas(vventas);
            opcion = DesplegarMenu("Menu de Punto de Tienda de Abarrotes la Pequeña", datosmenuprincipal);
            if (opcion == null) {
                opcion = "5";
            }
            switch (opcion) {
                case "1": MenuProductos(vproductos); break;
                case "2": MenuPuntoVenta(vventas, idticket, vproductos); break;
                case "3": MenuInventario(vproductos); break;
                case "4": System.out.println(MostrarListaVentas(vventas)); break;
                case "5": System.out.println("Salida del Sistema "); break;
                default: System.out.println("No existe esta opcion "); break;
            }
        } while (!opcion.equals("5"));
    }

    public static void main(String[] args) throws IOException {
        productos = CargarProductos();
        ventas = CrearVenta();
        MenuPrincipal(productos, ventas);
    }
}
