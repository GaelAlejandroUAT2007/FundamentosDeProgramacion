Algoritmo Alg03_TablaMultiplicar
	Definir numeroBase, limite, i, resultado Como Entero
	
	Escribir "=== GENERADOR DE TABLAS DE MULTIPLICAR ==="
	Escribir "Ingrese el numero base para la tabla:"
	Leer numeroBase
	Escribir "Ingrese el limite de la tabla (ej. 10 o 12):"
	Leer limite
	
	Escribir "Tabla del ", numeroBase, " hasta el ", limite, ":"
	Para i <- 1 Hasta limite Con Paso 1 Hacer
		resultado <- numeroBase * i
		Escribir numeroBase, " x ", i, " = ", resultado
	FinPara
FinAlgoritmo
