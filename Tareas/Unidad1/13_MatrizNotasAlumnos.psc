Algoritmo Alg13_MatrizNotasAlumnos
	Definir n, i Como Entero
	Definir calificaciones, suma, promedio, notaAlta, notaBaja Como Real
	Dimension calificaciones[100]
	
	Escribir "=== REGISTRO DE NOTAS DE GRUPO ==="
	Escribir "Ingrese el numero de alumnos (maximo 100):"
	Leer n
	
	suma <- 0
	Escribir "Ingrese la nota del alumno 1:"
	Leer calificaciones[0]
	notaAlta <- calificaciones[0]
	notaBaja <- calificaciones[0]
	suma <- suma + calificaciones[0]
	
	Para i <- 1 Hasta n - 1 Con Paso 1 Hacer
		Escribir "Ingrese la nota del alumno ", (i + 1), ":"
		Leer calificaciones[i]
		suma <- suma + calificaciones[i]
		
		Si calificaciones[i] > notaAlta Entonces
			notaAlta <- calificaciones[i]
		FinSi
		
		Si calificaciones[i] < notaBaja Entonces
			notaBaja <- calificaciones[i]
		FinSi
	FinPara
	
	promedio <- suma / n
	
	Escribir "----------------------------------------"
	Escribir "Total de alumnos evaluados: ", n
	Escribir "Promedio grupal: ", promedio
	Escribir "Calificacion mas alta: ", notaAlta
	Escribir "Calificacion mas baja: ", notaBaja
	Escribir "----------------------------------------"
FinAlgoritmo
