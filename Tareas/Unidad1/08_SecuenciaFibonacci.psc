Algoritmo Alg08_SecuenciaFibonacci
	Definir n, a, b, c, i Como Entero
	
	Escribir "=== SERIE FIBONACCI ==="
	Escribir "Ingrese la cantidad de terminos de Fibonacci a mostrar:"
	Leer n
	
	a <- 0
	b <- 1
	
	Escribir "Secuencia Fibonacci (" , n, " terminos):"
	Si n >= 1 Entonces
		Escribir Sin Saltar a, " "
	FinSi
	
	Si n >= 2 Entonces
		Escribir Sin Saltar b, " "
	FinSi
	
	Para i <- 3 Hasta n Con Paso 1 Hacer
		c <- a + b
		Escribir Sin Saltar c, " "
		a <- b
		b <- c
	FinPara
	Escribir ""
FinAlgoritmo
