Algoritmo Alg06_CalculoBisiesto
	Definir anio Como Entero
	
	Escribir "=== VERIFICADOR DE AÑO BISIESTO ==="
	Escribir "Ingrese un año:"
	Leer anio
	
	Escribir "----------------------------------------"
	Si (anio % 4 = 0 Y anio % 100 <> 0) O (anio % 400 = 0) Entonces
		Escribir "El año ", anio, " SÍ es bisiesto."
	Sino
		Escribir "El año ", anio, " NO es bisiesto."
	FinSi
	Escribir "----------------------------------------"
FinAlgoritmo
