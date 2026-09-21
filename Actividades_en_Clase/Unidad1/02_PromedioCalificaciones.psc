Algoritmo Alg02_PromedioCalificaciones
	Definir cal1, cal2, cal3, promedio Como Real
	Definir nombreEstudiante Como Caracter
	
	Escribir "=== CONTROL DE CALIFICACIONES ==="
	Escribir "Ingrese el nombre del estudiante:"
	Leer nombreEstudiante
	Escribir "Ingrese la calificacion 1 (0-100):"
	Leer cal1
	Escribir "Ingrese la calificacion 2 (0-100):"
	Leer cal2
	Escribir "Ingrese la calificacion 3 (0-100):"
	Leer cal3
	
	promedio <- (cal1 + cal2 + cal3) / 3
	
	Escribir "----------------------------------------"
	Escribir "Estudiante: ", nombreEstudiante
	Escribir "Promedio: ", promedio
	
	Si promedio >= 70 Entonces
		Si promedio >= 90 Entonces
			Escribir "Estatus: APROBADO CON EXCELENCIA"
		Sino
			Escribir "Estatus: APROBADO"
		FinSi
	Sino
		Escribir "Estatus: REPROBADO"
	FinSi
	Escribir "----------------------------------------"
FinAlgoritmo
