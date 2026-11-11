package a2253332351_estudiodecaso;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class capitulo5 {

    static String[][] productos;

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
        String cadena = titulo + "\n\n";
        cadena = cadena + MostrarMenu(menu);
        cadena = cadena + "\n Que opcion deseas ";
        return Dialogo(cadena);
    }

    public static boolean EsNumeroEntero(String dato) {
        if (dato == null || dato.isEmpty())
            return false;
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }

    public static boolean EsNumeroDouble(String dato) {
        boolean valido = false;
        boolean hayDigito = false;
        if (dato == null || dato.isEmpty())
            return false;
        for (char c : dato.toCharArray()) {
            if (Character.isDigit(c)) {
                hayDigito = true;
            } else if (c == '.' && !valido) {
                valido = true;
            } else {
                return false;
            }
        }
        return valido && hayDigito;
    }

    public static boolean EvaluarNumerico(String dato, int tipo) {
        boolean valido = false;
        switch (tipo) {
            case 1: valido = EsNumeroEntero(dato); break;
            case 2: valido = EsNumeroDouble(dato); break;
        }
        return valido;
    }

    public static String RellenarEspacios(String dato, int tamano) {
        String cadena = dato;
        for (int ciclo = dato.length(); ciclo < tamano; ciclo++) {
            cadena = cadena + " ";
        }
        return cadena;
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

    public static void MenuPuntoVenta(String idticket) throws IOException {
        String opcion, membrete;
        boolean pago = false;
        idticket = IdTicketSiguiente(idticket);
        String fechadia = Fecha();
        membrete = "Fecha del Dia " + fechadia + " Ticket No " + idticket;
        membrete = membrete + "\n-----------------------------------------------------\n";
        String[] datosmenu = { "1.-Agregar ", "2.-Eliminar ", "3.-Listado ", "4.-Pagar ", "5.-Salida " };

        do {
            opcion = DesplegarMenu(membrete + "\n Menu de Punto de Venta", datosmenu);
            if (opcion == null)
                System.out.println("dato incorrecto introducido");
            else
                switch (opcion) {
                    case "1": System.out.println("Agregar Articulo al Ticket "); break;
                    case "2": System.out.println("Eliminar Articulo del Ticket "); break;
                    case "3": System.out.println("Listado de Articulos del Ticket "); break;
                    case "4":
                        System.out.println("Pagar Ticket y salir");
                        opcion = "5";
                        pago = true;
                        break;
                    case "5":
                        System.out.println("Salida del Ventas ");
                        if (!pago) {
                            System.out.println("No pago el ticket ");
                            System.out.println("eliminando ticket " + idticket);
                        }
                        break;
                    default: System.out.println("No existe esta opcion"); break;
                }
        } while (!"5".equals(opcion));
    }

    public static void MenuInventario() throws IOException {
        String[] datosmenuinventario = { "1.-Listado ", "2.-Agregar ", "3.-Salida " };
        String opcion = "0";

        do {
            opcion = DesplegarMenu("Opciones de Inventarios", datosmenuinventario);
            if (opcion == null)
                System.out.println("opcion incorrecta ");
            else
                switch (opcion) {
                    case "1": System.out.println("Listado de Inventario "); break;
                    case "2": System.out.println("Agregar Inventario "); break;
                    case "3": System.out.println("Salida del Sistema "); break;
                    default: System.out.println("No existe esta opcion "); break;
                }
        } while (!"3".equals(opcion));
    }

    public static String[][] CargarProductosIndirecta() {
        String[][] producto = new String[10][4];
        producto[0][0] = "001"; producto[0][1] = "Arroz 1kg"; producto[0][2] = "35"; producto[0][3] = "10";
        producto[1][0] = "002"; producto[1][1] = "Azucar 1kg"; producto[1][2] = "25"; producto[1][3] = "10";
        producto[2][0] = "003"; producto[2][1] = "Harina 1kg"; producto[2][2] = "28"; producto[2][3] = "10";
        producto[3][0] = "004"; producto[3][1] = "Aceite 1L"; producto[3][2] = "50"; producto[3][3] = "10";
        producto[4][0] = "005"; producto[4][1] = "Leche 1L"; producto[4][2] = "35"; producto[4][3] = "10";
        producto[5][0] = "006"; producto[5][1] = "Huevos 12 unidades"; producto[5][2] = "45"; producto[5][3] = "10";
        producto[6][0] = "007"; producto[6][1] = "Fideos 500g"; producto[6][2] = "20"; producto[6][3] = "10";
        producto[7][0] = "008"; producto[7][1] = "Sal 1kg"; producto[7][2] = "15"; producto[7][3] = "10";
        producto[8][0] = "009"; producto[8][1] = "Pasta de tomate 400g"; producto[8][2] = "25"; producto[8][3] = "10";
        producto[9][0] = "010"; producto[9][1] = "Atun lata 170g"; producto[9][2] = "35"; producto[9][3] = "10";
        return producto;
    }

    public static String[][] CargarProductos() {
        String[][] producto = {
            { "001", "Arroz 1kg", "35", "10" },
            { "002", "Azucar 1kg", "25", "10" },
            { "003", "Harina 1kg", "28", "10" },
            { "004", "Aceite 1L", "50", "10" },
            { "005", "Leche 1L", "35", "10" },
            { "006", "Huevos 12 unidades", "45", "10" },
            { "007", "Fideos 500g", "20", "10" },
            { "008", "Sal 1kg", "15", "10" },
            { "009", "Pasta de tomate 400g", "25", "10" },
            { "010", "Atun lata 170g", "35", "10" }
        };
        return producto;
    }

    public static String MostrarProducto(String[] vproducto) {
        String codigo = RellenarEspacios(vproducto[0], 5);
        String producto = RellenarEspacios(vproducto[1], 30);
        String precio = RellenarEspacios(vproducto[2], 10);
        String cantidad = RellenarEspacios(vproducto[3], 10);
        String cadena = codigo.concat(producto + precio + cantidad);
        return cadena;
    }

    public static String MostrarLista(String[][] vproductos) {
        String salida = "";
        for (int ciclo = 0; ciclo < vproductos.length; ciclo++) {
            String[] vproducto = {
                vproductos[ciclo][0],
                vproductos[ciclo][1],
                vproductos[ciclo][2],
                vproductos[ciclo][3]
            };
            String cadena = MostrarProducto(vproducto);
            salida = salida.concat(cadena + "\n");
        }
        return salida;
    }

    public static int ExisteProducto(String codigo, String[][] vproductos) {
        int enc, pos, tam, ciclo;
        enc = -1;
        pos = 0;
        tam = vproductos.length;
        for (ciclo = 0; ciclo < tam; ciclo++) {
            if (vproductos[ciclo][0].compareTo(codigo.trim()) == 0) {
                enc = pos;
            }
            pos++;
        }
        return enc;
    }

    public static void ModificarProducto(String[][] vproductos) throws IOException {
        String codigo, precio;
        int posicion;
        String info = MostrarLista(vproductos);
        codigo = Leer(info + "\nIntroduce el codigo del producto a modificar");
        if (codigo != null) {
            posicion = ExisteProducto(codigo, vproductos);
            if (posicion > -1) {
                String[] vproducto = {
                    vproductos[posicion][0],
                    vproductos[posicion][1],
                    vproductos[posicion][2],
                    vproductos[posicion][3]
                };
                precio = Leer("\nIntroduce el precio de " + MostrarProducto(vproducto) + " ");
                if (precio != null) {
                    if (EvaluarNumerico(precio, 2) || EvaluarNumerico(precio, 1)) {
                        if (Double.parseDouble(precio) > 0) {
                            vproductos[posicion][2] = precio;
                            System.out.println("Producto modificado con exito.");
                        } else {
                            System.out.println("el precio debe ser mayor a cero");
                        }
                    } else {
                        System.out.println("no es un valor numerico");
                    }
                } else {
                    System.out.println("dato nulo");
                }
            } else {
                System.out.println("no existe el codigo");
            }
        } else {
            System.out.println("dato nulo");
        }
    }

    public static void MenuProductos(String[][] vproductos) throws IOException {
        String[] datosmenuproductos = { "1.-Modificar ", "2.-Listado ", "3.-Salida " };
        String opcion = "0";

        do {
            opcion = DesplegarMenu("Opciones de Productos", datosmenuproductos);
            if (opcion == null)
                System.out.println("opcion incorrecta ");
            else
                switch (opcion) {
                    case "1": ModificarProducto(vproductos); break;
                    case "2": System.out.println(MostrarLista(vproductos)); break;
                    case "3": System.out.println("Salida del Sistema "); break;
                    default: System.out.println("No existe esta opcion "); break;
                }
        } while (!"3".equals(opcion));
    }

    public static void MenuPrincipal(String[][] vproductos) throws IOException {
        String[] datosmenuprincipal = {
            "1.-Productos ",
            "2.-Punto de Venta ",
            "3.-Inventario ",
            "4.-Ventas ",
            "5.-Salida "
        };
        String opcion = "0";

        do {
            opcion = DesplegarMenu("Menu de Punto de Tienda de Abarrotes la Pequena", datosmenuprincipal);
            if (opcion == null)
                System.out.println("opcion incorrecta ");
            else
                switch (opcion) {
                    case "1": MenuProductos(vproductos); break;
                    case "2": MenuPuntoVenta("000"); break;
                    case "3": MenuInventario(); break;
                    case "4": System.out.println("Ventas"); break;
                    case "5": System.out.println("Salida del Sistema "); break;
                    default: System.out.println("No existe esta opcion "); break;
                }
        } while (!"5".equals(opcion));
    }

    public static void main(String[] args) throws IOException {
        productos = CargarProductos();
        MenuPrincipal(productos);
    }
}
