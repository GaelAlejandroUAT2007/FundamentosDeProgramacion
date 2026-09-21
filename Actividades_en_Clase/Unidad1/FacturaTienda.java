package programas;

import javax.swing.JOptionPane;

public class FacturaTienda {
    public static void main(String[] args) {
        String nombreCliente = JOptionPane.showInputDialog("Ingrese nombre del cliente:");
        String nombreProducto = JOptionPane.showInputDialog("Ingrese nombre del producto:");
        
        String strCantidad = JOptionPane.showInputDialog("Ingrese la cantidad comprada:");
        int cantidad = Integer.parseInt(strCantidad);
        
        String strPrecio = JOptionPane.showInputDialog("Ingrese el precio unitario:");
        double precioUnitario = Double.parseDouble(strPrecio);
        
        double subtotal = cantidad * precioUnitario;
        double descuento = 0.0;
        
        if (subtotal > 1000) {
            descuento = subtotal * 0.10;
        } else if (subtotal > 500) {
            descuento = subtotal * 0.05;
        }
        
        double subtotalConDescuento = subtotal - descuento;
        double iva = subtotalConDescuento * 0.16;
        double total = subtotalConDescuento + iva;
        
        String mensaje = "=== RESUMEN DE FACTURA ===\n"
                + "Cliente: " + nombreCliente + "\n"
                + "Producto: " + nombreProducto + "\n"
                + "Cantidad: " + cantidad + "\n"
                + "Precio Unitario: $" + String.format("%.2f", precioUnitario) + "\n"
                + "Subtotal: $" + String.format("%.2f", subtotal) + "\n"
                + "Descuento: $" + String.format("%.2f", descuento) + "\n"
                + "Subtotal con descuento: $" + String.format("%.2f", subtotalConDescuento) + "\n"
                + "IVA (16%): $" + String.format("%.2f", iva) + "\n"
                + "Total a Pagar: $" + String.format("%.2f", total);
                
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
