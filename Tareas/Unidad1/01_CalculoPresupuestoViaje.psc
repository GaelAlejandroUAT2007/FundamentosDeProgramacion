Algoritmo Alg01_CalculoPresupuestoViaje
	Definir presupuestoTotal, hospedaje, alimentacion, transporte, varios, totalGastos, restante Como Real
	Definir destino Como Caracter
	
	Escribir "=== PRESUPUESTO DE VIAJE ==="
	Escribir "Ingrese el destino del viaje:"
	Leer destino
	Escribir "Ingrese el presupuesto total disponible ($):"
	Leer presupuestoTotal
	Escribir "Ingrese gasto estimado en hospedaje:"
	Leer hospedaje
	Escribir "Ingrese gasto estimado en alimentacion:"
	Leer alimentacion
	Escribir "Ingrese gasto estimado en transporte:"
	Leer transporte
	Escribir "Ingrese gastos varios:"
	Leer varios
	
	totalGastos <- hospedaje + alimentacion + transporte + varios
	restante <- presupuestoTotal - totalGastos
	
	Escribir "----------------------------------------"
	Escribir "Destino: ", destino
	Escribir "Presupuesto Total: $", presupuestoTotal
	Escribir "Gastos Totales Estimados: $", totalGastos
	Si restante >= 0 Entonces
		Escribir "Estado: Presupuesto suficiente. Resta: $", restante
	Sino
		Escribir "Estado: DEFICIT. Falta dinero por: $", (restante * -1)
	FinSi
	Escribir "----------------------------------------"
FinAlgoritmo
