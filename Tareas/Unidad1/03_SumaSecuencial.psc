Algoritmo Alg03_SumaSecuencial
	Definir n, i, suma Como Entero
	
	Escribir "=== SUMA SECUENCIAL DE N NUMEROS ==="
	Escribir "Ingrese la cantidad de numeros a sumar (N):"
	Leer n
	
	suma <- 0
	Para i <- 1 Hasta n Con Paso 1 Hacer
		suma <- suma + i
	FinPara
	
	Escribir "----------------------------------------"
	Escribir "La suma de los primeros ", n, " numeros es: ", suma
	Escribir "----------------------------------------"
FinAlgoritmo
