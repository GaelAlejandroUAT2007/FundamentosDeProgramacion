Algoritmo Alg12_CalculoFactorial
	Definir num, i, factorial Como Entero
	
	Escribir "=== CALCULO DE FACTORIAL (N!) ==="
	Escribir "Ingrese un numero entero no negativo:"
	Leer num
	
	Si num < 0 Entonces
		Escribir "Error: No existe el factorial de un numero negativo."
	Sino
		factorial <- 1
		Para i <- 1 Hasta num Con Paso 1 Hacer
			factorial <- factorial * i
		FinPara
		
		Escribir "----------------------------------------"
		Escribir "El factorial de ", num, "! es: ", factorial
		Escribir "----------------------------------------"
	FinSi
FinAlgoritmo
