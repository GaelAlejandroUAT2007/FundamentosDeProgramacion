Algoritmo Alg11_AdivinaNumero
	Definir numeroSecreto, intento, contadorIntentos Como Entero
	
	numeroSecreto <- 42
	contadorIntentos <- 0
	intento <- 0
	
	Escribir "=== JUEGO DE ADIVINAR EL NUMERO (1 al 100) ==="
	
	Mientras intento <> numeroSecreto Hacer
		Escribir "Ingresa tu suposicion:"
		Leer intento
		contadorIntentos <- contadorIntentos + 1
		
		Si intento < numeroSecreto Entonces
			Escribir "El numero secreto es MAYOR."
		Sino
			Si intento > numeroSecreto Entonces
				Escribir "El numero secreto es MENOR."
			Sino
				Escribir "Felicidades! Adivinaste el numero en ", contadorIntentos, " intentos."
			FinSi
		FinSi
	FinMientras
FinAlgoritmo
