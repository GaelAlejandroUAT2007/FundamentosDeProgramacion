Algoritmo Alg04_CalculadoraComisionVentas
	Definir ventasTotales, sueldoBase, porcentajeComision, comision, sueldoTotal Como Real
	Definir nombreVendedor Como Caracter
	
	Escribir "=== COMISIONES DE VENTAS ==="
	Escribir "Ingrese el nombre del vendedor:"
	Leer nombreVendedor
	Escribir "Ingrese el sueldo base mensual ($):"
	Leer sueldoBase
	Escribir "Ingrese el total de ventas realizadas en el mes ($):"
	Leer ventasTotales
	
	Si ventasTotales > 50000 Entonces
		porcentajeComision <- 0.15
	Sino
		Si ventasTotales > 20000 Entonces
			porcentajeComision <- 0.10
		Sino
			porcentajeComision <- 0.05
		FinSi
	FinSi
	
	comision <- ventasTotales * porcentajeComision
	sueldoTotal <- sueldoBase + comision
	
	Escribir "----------------------------------------"
	Escribir "Vendedor: ", nombreVendedor
	Escribir "Sueldo Base: $", sueldoBase
	Escribir "Ventas Totales: $", ventasTotales
	Escribir "Comision aplicada: (", (porcentajeComision * 100), "%) $", comision
	Escribir "Sueldo Total a Percibir: $", sueldoTotal
	Escribir "----------------------------------------"
FinAlgoritmo
