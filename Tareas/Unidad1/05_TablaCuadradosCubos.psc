Algoritmo Alg05_TablaCuadradosCubos
	Definir n, i, cuadrado, cubo Como Entero
	
	Escribir "=== TABLA DE CUADRADOS Y CUBOS ==="
	Escribir "Ingrese hasta que numero desea calcular:"
	Leer n
	
	Escribir "Numero | Cuadrado | Cubo"
	Para i <- 1 Hasta n Con Paso 1 Hacer
		cuadrado <- i * i
		cubo <- i * i * i
		Escribir i, " | ", cuadrado, " | ", cubo
	FinPara
FinAlgoritmo
