Algoritmo Alg01_FacturaTienda
	Definir cantidad Como Entero
	Definir precioUnitario, subtotal, descuento, subtotalConDescuento, iva, total Como Real
	Definir nombreCliente, nombreProducto Como Caracter
	
	Escribir "=== SISTEMA DE FACTURACION DE TIENDA ==="
	Escribir "Ingrese nombre del cliente:"
	Leer nombreCliente
	Escribir "Ingrese nombre del producto:"
	Leer nombreProducto
	Escribir "Ingrese la cantidad comprada:"
	Leer cantidad
	Escribir "Ingrese el precio unitario:"
	Leer precioUnitario
	
	subtotal <- cantidad * precioUnitario
	
	Si subtotal > 1000 Entonces
		descuento <- subtotal * 0.10
	Sino
		Si subtotal > 500 Entonces
			descuento <- subtotal * 0.05
		Sino
			descuento <- 0
		FinSi
	FinSi
	
	subtotalConDescuento <- subtotal - descuento
	iva <- subtotalConDescuento * 0.16
	total <- subtotalConDescuento + iva
	
	Escribir "----------------------------------------"
	Escribir "Cliente: ", nombreCliente
	Escribir "Producto: ", nombreProducto
	Escribir "Subtotal: $", subtotal
	Escribir "Descuento aplicado: $", descuento
	Escribir "Subtotal con descuento: $", subtotalConDescuento
	Escribir "IVA (16%): $", iva
	Escribir "Total a pagar: $", total
	Escribir "----------------------------------------"
FinAlgoritmo
