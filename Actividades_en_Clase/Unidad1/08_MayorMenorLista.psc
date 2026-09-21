Algoritmo Alg08_MayorMenorLista
	Definir n, i, num, mayor, menor Como Entero
	
	Escribir "=== BUSQUEDA DE MAYOR Y MENOR ==="
	Escribir "Ingrese la cantidad de numeros a evaluar:"
	Leer n
	
	Si n > 0 Entonces
		Escribir "Ingrese el numero 1:"
		Leer num
		mayor <- num
		menor <- num
		
		Para i <- 2 Hasta n Con Paso 1 Hacer
			Escribir "Ingrese el numero ", i, ":"
			Leer num
			
			Si num > mayor Entonces
				mayor <- num
			FinSi
			
			Si num < menor Entonces
				menor <- num
			FinSi
		FinPara
		
		Escribir "----------------------------------------"
		Escribir "El numero MAYOR es: ", mayor
		Escribir "El numero MENOR es: ", menor
		Escribir "----------------------------------------"
	Sino
		Escribir "La cantidad debe ser mayor a 0."
	FinSi
FinAlgoritmo
