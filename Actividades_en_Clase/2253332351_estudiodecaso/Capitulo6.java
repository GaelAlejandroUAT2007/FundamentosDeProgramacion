package a2253332351_estudiodecaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Capitulo6 {

   
    static String[][] productos;

   
    static final BufferedReader lectorTeclado =
            new BufferedReader(new InputStreamReader(System.in));

    public static String MostrarMenu(String[] opciones) {
        String cadena = "";
        for (String info : opciones) {
            cadena += info + "\n";
        }
        return cadena;
    }

    public static String Dialogo(String texto) throws IOException {
        System.out.print(texto + " : ");
        String respuesta = lectorTeclado.readLine();
        if (respuesta == null) {
            System.out.println("\nFin de la entrada. Saliendo del sistema.");
            System.exit(0);
        }
        return respuesta;
    }

    public static String DesplegarMenu(String titulo, String[] menu) throws IOException {
        String cadena = titulo + "\n\n";
        cadena += MostrarMenu(menu);
        cadena += "\n Que opcion deseas";
        return Leer(cadena);
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
        for (char caracter : dato.toCharArray()) {
            if (!Character.isDigit(caracter)) {
                return false;
            }
        }
        return true;
    }

    public static boolean EsNumeroDouble(String dato) {
        if (dato == null || dato.isEmpty()) {
            return false;
        }
        boolean puntoEncontrado = false;
        boolean hayDigito = false;
        for (char caracter : dato.toCharArray()) {
            if (Character.isDigit(caracter)) {
                hayDigito = true;
            } else if (caracter == '.' && !puntoEncontrado) {
                puntoEncontrado = true;
            } else {
                return false;
            }
        }
        return hayDigito;
    }

   
    public static boolean EvaluarNumerico(String dato, int tipo) {
        boolean esValido = false;
        switch (tipo) {
            case 1:
                esValido = EsNumeroEntero(dato);
                break;
            case 2:
                esValido = EsNumeroDouble(dato);
                break;
        }
        return esValido;
    }

    public static String RellenarEspacios(String dato, int tamano) {
        return String.format("%1$-" + tamano + "s", dato);
    }

    public static String IdTicketSiguiente(String idTicket) {
        int numero = Integer.parseInt(idTicket) + 1;
        if (numero < 10) {
            return "00" + numero;
        } else if (numero < 100) {
            return "0" + numero;
        }
        return String.valueOf(numero);
    }

    public static String Fecha() {
        return new SimpleDateFormat("dd-MM-yyyy").format(new Date());
    }

    public static String[][] CargarProductos() {
        String[][] catalogo = {
            {"001", "Arroz 1kg",            "35", "10"},
            {"002", "Azucar 1kg",           "25", "10"},
            {"003", "Harina 1kg",           "28", "10"},
            {"004", "Aceite 1L",            "50", "10"},
            {"005", "Leche 1L",             "35", "10"},
            {"006", "Huevos 12 unidades",   "45", "10"},
            {"007", "Fideos 500g",          "20", "10"},
            {"008", "Sal 1kg",              "15", "10"},
            {"009", "Pasta de tomate 400g", "25", "10"},
            {"010", "Atun lata 170g",       "35", "10"}
        };
        return catalogo;
    }

    public static String MostrarProducto(String[] vproducto) {
        String codigo   = RellenarEspacios(vproducto[0], 5);
        String producto = RellenarEspacios(vproducto[1], 30);
        String precio   = RellenarEspacios(vproducto[2], 10);
        String cantidad = RellenarEspacios(vproducto[3], 10);
        return codigo + producto + precio + cantidad;
    }

    public static String MostrarLista(String[][] vproductos) {
        String salida = RellenarEspacios("Cod", 5) + RellenarEspacios("Producto", 30)
                + RellenarEspacios("Precio", 10) + RellenarEspacios("Cantidad", 10) + "\n";
        for (int ciclo = 0; ciclo < vproductos.length; ciclo++) {
            salida += MostrarProducto(vproductos[ciclo]) + "\n";
        }
        return salida;
    }

    
    public static int ExisteProducto(String codigo, String[][] vproductos) {
        int encontrado = -1;
        for (int ciclo = 0; ciclo < vproductos.length; ciclo++) {
            if (vproductos[ciclo][0].trim().equals(codigo.trim())) {
                encontrado = ciclo;
                break;
            }
        }
        return encontrado;
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
        String precio = Leer("\nIntroduce el nuevo precio de " + MostrarProducto(vproductos[posicion]));
        if (precio == null) {
            System.out.println("dato nulo");
        } else if (EvaluarNumerico(precio, 2) || EvaluarNumerico(precio, 1)) {
            vproductos[posicion][2] = precio;
            System.out.println("Producto modificado con exito.");
        } else {
            System.out.println("no es un valor numerico");
        }
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
      
        String[] vproducto = {vproductos[posicion][0], vproductos[posicion][1],
                              vproductos[posicion][3], ""};
        String cantidadIngresada = Leer("\nIntroduce la Cantidad de Stock a Agregar\n"
                + MostrarProducto(vproducto));
        if (cantidadIngresada == null) {
            System.out.println("dato nulo");
        } else if (!EsNumeroEntero(cantidadIngresada) || cantidadIngresada.length() > 9) {
            System.out.println("no es un valor numerico entero valido");
        } else if (Integer.parseInt(cantidadIngresada) == 0) {
            System.out.println("la cantidad debe ser mayor a cero");
        } else {
            int stockActualizado = Integer.parseInt(cantidadIngresada)
                    + Integer.parseInt(vproductos[posicion][3]);
            vproductos[posicion][3] = String.valueOf(stockActualizado);
            System.out.println("Stock actualizado. Nuevo stock de "
                    + vproductos[posicion][1] + ": " + stockActualizado);
        }
    }


    public static int DescontarStock(String[][] vproductos, String codigo, int cantidad) {
        int posicion = ExisteProducto(codigo, vproductos);
        if (posicion < 0) {
            return -2;
        }
        int stockActual = Integer.parseInt(vproductos[posicion][3]);
        if (stockActual == 0) {
            return 0;
        }
        if (cantidad > stockActual) {
            return -1;
        }
        vproductos[posicion][3] = String.valueOf(stockActual - cantidad);
        return 1;
    }

   
    public static void DescontarStockMenu(String[][] vproductos) throws IOException {
        String codigo = Leer(MostrarLista(vproductos) + "\nIntroduce el codigo del producto a descontar");
        if (codigo == null) {
            System.out.println("dato nulo");
            return;
        }
        String cantidadTexto = Leer("Introduce la cantidad a descontar");
        if (cantidadTexto == null) {
            System.out.println("dato nulo");
            return;
        }
        if (!EsNumeroEntero(cantidadTexto) || cantidadTexto.length() > 9
                || Integer.parseInt(cantidadTexto) == 0) {
            System.out.println("la cantidad debe ser un entero mayor a cero");
            return;
        }
        int resultado = DescontarStock(vproductos, codigo, Integer.parseInt(cantidadTexto));
        switch (resultado) {
            case -2: System.out.println("no existe el codigo"); break;
            case -1: System.out.println("la cantidad supera el stock disponible"); break;
            case 0:  System.out.println("el producto esta agotado"); break;
            case 1:  System.out.println("Stock descontado correctamente"); break;
        }
    }


    public static void MenuProductos(String[][] vproductos) throws IOException {
        String[] datosMenuProductos = {"1.-Modificar", "2.-Listado", "3.-Salida"};
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Opciones de Productos", datosMenuProductos);
            if (opcion == null) {
                System.out.println("opcion incorrecta");
            } else {
                switch (opcion) {
                    case "1": ModificarProducto(vproductos); break;
                    case "2": System.out.println(MostrarLista(vproductos)); break;
                    case "3": System.out.println("Salida de Productos"); break;
                    default:  System.out.println("No existe esta opcion"); break;
                }
            }
        } while (!"3".equals(opcion));
    }

    public static void MenuInventario(String[][] vproductos) throws IOException {
        String[] datosMenuInventario = {"1.-Listado", "2.-Agregar", "3.-Descontar (actividad 6.6.5)", "4.-Salida"};
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Opciones de Inventarios", datosMenuInventario);
            if (opcion == null) {
                System.out.println("opcion incorrecta");
            } else {
                switch (opcion) {
                    case "1": System.out.println(MostrarLista(vproductos)); break;
                    case "2": AgregarStock(vproductos); break;
                    case "3": DescontarStockMenu(vproductos); break;
                    case "4": System.out.println("Salida de Inventarios"); break;
                    default:  System.out.println("No existe esta opcion"); break;
                }
            }
        } while (!"4".equals(opcion));
    }

    public static void MenuPuntoVenta(String idTicket) throws IOException {
        String siguiente = IdTicketSiguiente(idTicket);
        System.out.println("Fecha del Dia " + Fecha() + " Ticket No " + siguiente);
        System.out.println("(El proceso de venta se desarrolla en el Capitulo 7)\n");
    }

    public static void MenuPrincipal(String[][] vproductos) throws IOException {
        String[] datosMenuPrincipal = {"1.-Productos", "2.-Punto de Venta", "3.-Inventario",
                                       "4.-Ventas", "5.-Salida"};
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Menu de Punto de Tienda de Abarrotes La Pequena", datosMenuPrincipal);
            if (opcion == null) {
                System.out.println("opcion incorrecta");
            } else {
                switch (opcion) {
                    case "1": MenuProductos(vproductos); break;
                    case "2": MenuPuntoVenta("000"); break;
                    case "3": MenuInventario(vproductos); break;
                    case "4": System.out.println("Ventas (se desarrolla en el Capitulo 7)\n"); break;
                    case "5": System.out.println("Salida del Sistema"); break;
                    default:  System.out.println("No existe esta opcion"); break;
                }
            }
        } while (!"5".equals(opcion));
    }

    public static void main(String[] args) throws IOException {
        productos = CargarProductos();
        MenuPrincipal(productos);
    }
}
