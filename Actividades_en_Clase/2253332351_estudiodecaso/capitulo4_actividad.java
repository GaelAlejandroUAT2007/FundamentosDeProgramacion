package a2253332351_estudiodecaso;

import java.io.IOException;

public class capitulo4_actividad {

    @FunctionalInterface
    interface Accion {
        void ejecutar() throws IOException;
    }

    public static void GestionarMenu(String titulo, String[] opciones, Accion[] acciones) throws IOException {
        int posicionSalida = opciones.length;
        String opcion;

        do {
            opcion = capitulo4.DesplegarMenu(titulo, opciones);

            if (opcion == null) {
                System.out.println("opcion incorrecta ");
            } else if (!capitulo4.EsNumeroEntero(opcion)
                    || Integer.parseInt(opcion) < 1
                    || Integer.parseInt(opcion) > posicionSalida) {
                System.out.println("No existe esta opcion ");
            } else {
                int indice = Integer.parseInt(opcion) - 1;

                if (indice == posicionSalida - 1) {
                    System.out.println("Salida del Sistema ");
                } else {
                    acciones[indice].ejecutar();
                }
            }
        } while (opcion == null || !opcion.equals(String.valueOf(posicionSalida)));
    }

    public static void MenuPrincipal() throws IOException {
        String[] opciones = {
            "1.-Productos ",
            "2.-Punto de Venta ",
            "3.-Inventario ",
            "4.-Ventas ",
            "5.-Salida "
        };

        Accion[] acciones = {
            () -> MenuProductos(),
            () -> capitulo4.MenuPuntoVenta("000"),
            () -> MenuInventario(),
            () -> System.out.println("Ventas "),
            null
        };

        GestionarMenu("Menu de Punto Tienda de Abarrotes La Pequeña", opciones, acciones);
    }

    public static void MenuProductos() throws IOException {
        String[] opciones = {
            "1.-Modificar ",
            "2.-Listado ",
            "3.-Salida "
        };

        Accion[] acciones = {
            () -> System.out.println("Modificar Precio Producto "),
            () -> System.out.println("Listado Producto "),
            null
        };

        GestionarMenu("Opciones de Productos", opciones, acciones);
    }

    public static void MenuInventario() throws IOException {
        String[] opciones = {
            "1.-Listado ",
            "2.-Agregar ",
            "3.-Salida "
        };

        Accion[] acciones = {
            () -> System.out.println("Listado de Inventario "),
            () -> System.out.println("Agregar Inventario "),
            null
        };

        GestionarMenu("Opciones de Inventarios", opciones, acciones);
    }

    public static void main(String[] args) throws IOException {
        MenuPrincipal();
    }
}
