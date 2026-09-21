Algoritmo Alg13_EstadisticaArreglo
	Definir n, i, valores, elementoBuscar Como Entero
	Definir suma, promedio Como Real
	Definir encontrado Como Entero
	Dimension valores[100]
	
	Escribir "=== PROCESAMIENTO DE ARREGLO ==="
	Escribir "Ingrese la cantidad de elementos a registrar (maximo 100):"
	Leer n
	
	suma <- 0
	Para i <- 0 Hasta n - 1 Con Paso 1 Hacer
		Escribir "Ingrese el valor de la posicion [", i, "]:"
		Leer valores[i]
		suma <- suma + valores[i]
	FinPara
	
	promedio <- suma / n
	
	Escribir "Ingrese un numero para buscar dentro del arreglo:"
	Leer elementoBuscar
	
	encontrado <- 0
	Para i <- 0 Hasta n - 1 Con Paso 1 Hacer
		Si valores[i] = elementoBuscar Entonces
			encontrado <- 1
		FinSi
	FinPara
	
	Escribir "----------------------------------------"
	Escribir "Suma total de valores: ", suma
	Escribir "Promedio de los elementos: ", promedio
	Si encontrado = 1 Entonces
		Escribir "El numero ", elementoBuscar, " SÍ se encuentra en el arreglo."
	Sino
		Escribir "El numero ", elementoBuscar, " NO se encuentra en el arreglo."
	FinSi
	Escribir "----------------------------------------"
FinAlgoritmo
