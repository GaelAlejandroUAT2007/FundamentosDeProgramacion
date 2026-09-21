Algoritmo Alg12_InversionCapitalInteres
	Definir capitalInicial, tasaInteres, capitalFinal Como Real
	Definir anios, i Como Entero
	
	Escribir "=== SIMULADOR DE INVERSION BANCARIA ==="
	Escribir "Ingrese el capital inicial ($):"
	Leer capitalInicial
	Escribir "Ingrese la tasa de interes anual (ej. 5 para 5%):"
	Leer tasaInteres
	Escribir "Ingrese el plazo en años:"
	Leer anios
	
	capitalFinal <- capitalInicial
	Para i <- 1 Hasta anios Con Paso 1 Hacer
		capitalFinal <- capitalFinal + (capitalFinal * (tasaInteres / 100))
	FinPara
	
	Escribir "----------------------------------------"
	Escribir "Capital Inicial: $", capitalInicial
	Escribir "Plazo: ", anios, " años"
	Escribir "Interes Anual: ", tasaInteres, "%"
	Escribir "Capital Final Acumulado: $", capitalFinal
	Escribir "Ganancia neta: $", (capitalFinal - capitalInicial)
	Escribir "----------------------------------------"
FinAlgoritmo
