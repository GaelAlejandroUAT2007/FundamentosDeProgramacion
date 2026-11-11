package a2253332351_estudiodecaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class capitulo4 {

    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static String MostrarMenuWhile(String[] opciones) {
        String cadena = "";
        int i = 0;
        while (i < opciones.length) {
            cadena += (i + 1) + ". " + opciones[i] + "\n";
            i++;
        }
        return cadena;
    }

    public static String MostrarMenu(String[] opciones) {
        String cadena = "";
        int i = 1;
        for (String info : opciones) {
            cadena = cadena + i + ". " + info + "\n";
            i++;
        }
        return cadena;
    }

    public static String Dialogo(String texto) throws IOException {
        String cadena;
        System.out.println(texto + " : ");
        cadena = lectura.readLine();
        if (cadena == null) {
            System.out.println("Entrada finalizada. Hasta luego.");
            System.exit(0);
        }
        return cadena;
    }

    public static String DesplegarMenu(String Titulo1, String[] menu) throws IOException {
        String cadena;
        cadena = Titulo1 + "\n" + "\n";
        cadena = cadena + MostrarMenu(menu);
        cadena = cadena + "\n Que opcion deseas ";
        return cadena = Leer(cadena);
    }

    public static String Leer(String texto) throws IOException {
        String cadena = "";
        cadena = Dialogo(texto);
        if (cadena != null) {
            cadena = cadena.trim();
            if (cadena.isEmpty())
                cadena = null;
        } else
            cadena = null;
        return cadena;
    }

    public static boolean EsNumeroEntero(String dato) {
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean EsNumeroDouble(String dato) {
        boolean valido = false;
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) {
                if (c == '.' && !valido) {
                    valido = true;
                } else {
                    return false;
                }
            }
        }
        return valido;
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

    public static String RellenarEspaciosConCiclo(String dato, int tamano) {
        String cadena;
        cadena = dato;
        for (int ciclo = dato.length(); ciclo < tamano; ciclo++) {
            cadena = cadena + " ";
        }
        return cadena;
    }

    public static String RellenarEspacios(String dato, int tamano) {
        return String.format("%1$-" + tamano + "s", dato);
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

    public static void MenuPrincipal() throws IOException {
        String[] datosmenuprincipal = {"1.-Productos ", "2.-Punto de Venta ", "3.-Inventario ", "4.-Ventas ", "5.-Salida "};
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Menu de Punto Tienda de Abarrotes La Pequeña", datosmenuprincipal);
            if (opcion == null) {
                System.out.println("opcion incorrecta ");
            } else {
                switch (opcion) {
                    case "1": MenuProductos(); break;
                    case "2": MenuPuntoVenta("000"); break;
                    case "3": MenuInventario(); break;
                    case "4": System.out.println("Ventas "); break;
                    case "5": System.out.println("Salida del Sistema "); break;
                    default: System.out.println("No existe esta opcion "); break;
                }
            }
        } while (opcion == null || opcion.compareTo("5") != 0);
    }

    public static void MenuProductos() throws IOException {
        String[] datosmenuproductos = {"1.-Modificar ", "2.-Listado ", "3.-Salida "};
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Opciones de Productos", datosmenuproductos);
            if (opcion == null) {
                System.out.println("opcion incorrecta ");
            } else {
                switch (opcion) {
                    case "1": System.out.println("Modificar Precio Producto "); break;
                    case "2": System.out.println("Listado Producto "); break;
                    case "3": System.out.println("Salida del Sistema "); break;
                    default: System.out.println("No existe esta opcion "); break;
                }
            }
        } while (opcion == null || opcion.compareTo("3") != 0);
    }

    public static void MenuPuntoVenta(String idticket) throws IOException {
        String opcion, membrete;
        boolean pago = false;
        idticket = IdTicketSiguiente(idticket);
        String fechadia = Fecha();
        membrete = "Fecha del Dia " + fechadia + " Ticket No " + idticket;
        membrete = membrete + "\n-----------------------------------------------------\n";
        String[] datosmenu = {"1.-Agregar ", "2.-Eliminar ", "3.-Listado ", "4.-Pagar ", "5.-Salida "};
        do {
            opcion = DesplegarMenu(membrete + "\n Menu de Punto de Venta", datosmenu);
            if (opcion == null) {
                System.out.println("dato incorrecto introducido");
            } else {
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
            }
        } while (opcion == null || opcion.compareTo("5") != 0);
    }

    public static void MenuInventario() throws IOException {
        String[] datosmenuinventario = {"1.-Listado ", "2.-Agregar ", "3.-Salida "};
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Opciones de Inventarios", datosmenuinventario);
            if (opcion == null) {
                System.out.println("opcion incorrecta ");
            } else {
                switch (opcion) {
                    case "1": System.out.println("Listado de Inventario "); break;
                    case "2": System.out.println("Agregar Inventario "); break;
                    case "3": System.out.println("Salida del Sistema "); break;
                    default: System.out.println("No existe esta opcion "); break;
                }
            }
        } while (opcion == null || opcion.compareTo("3") != 0);
    }

    public static void main(String[] args) throws IOException {
        MenuPrincipal();
    }
}

