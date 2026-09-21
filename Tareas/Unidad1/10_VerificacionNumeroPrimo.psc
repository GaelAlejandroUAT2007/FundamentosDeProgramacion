Algoritmo Alg10_VerificacionNumeroPrimo
	Definir num, i, contadorDivisores Como Entero
	
	Escribir "=== VERIFICADOR DE NUMEROS PRIMOS ==="
	Escribir "Ingrese un numero entero positivo:"
	Leer num
	
	contadorDivisores <- 0
	Si num > 1 Entonces
		Para i <- 1 Hasta num Con Paso 1 Hacer
			Si num % i = 0 Entonces
				contadorDivisores <- contadorDivisores + 1
			FinSi
		FinPara
		
		Escribir "----------------------------------------"
		Si contadorDivisores = 2 Entonces
			Escribir "El numero ", num, " SÍ es primo."
		Sino
			Escribir "El numero ", num, " NO es primo (es compuesto)."
		FinSi
		Escribir "----------------------------------------"
	Sino
		Escribir "El numero debe ser mayor a 1."
	FinSi
FinAlgoritmo
