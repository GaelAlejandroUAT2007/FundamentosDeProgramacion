Algoritmo Alg09_CalculoTarifaEstacionamiento
	Definir horas Como Entero
	Definir tarifaPorHora, total Como Real
	Definir tipoVehiculo Como Caracter
	
	Escribir "=== TARIFA DE ESTACIONAMIENTO ==="
	Escribir "Ingrese el tipo de vehiculo (Auto / Moto / Camioneta):"
	Leer tipoVehiculo
	Escribir "Ingrese las horas de estancia:"
	Leer horas
	
	tarifaPorHora <- 20.0
	Si tipoVehiculo = "Moto" O tipoVehiculo = "moto" Entonces
		tarifaPorHora <- 10.0
	Sino
		Si tipoVehiculo = "Camioneta" O tipoVehiculo = "camioneta" Entonces
			tarifaPorHora <- 30.0
		FinSi
	FinSi
	
	total <- horas * tarifaPorHora
	
	Escribir "----------------------------------------"
	Escribir "Vehiculo: ", tipoVehiculo
	Escribir "Horas en estacionamiento: ", horas
	Escribir "Tarifa por hora: $", tarifaPorHora
	Escribir "Total a pagar: $", total
	Escribir "----------------------------------------"
FinAlgoritmo
