Algoritmo Alg05_ContadorParesImpares
	Definir totalNumeros, i, num, contadorPares, contadorImpares Como Entero
	
	Escribir "=== CONTADOR DE NUMEROS PARES E IMPARES ==="
	Escribir "Cuantos numeros desea ingresar?"
	Leer totalNumeros
	
	contadorPares <- 0
	contadorImpares <- 0
	
	Para i <- 1 Hasta totalNumeros Con Paso 1 Hacer
		Escribir "Ingrese el numero ", i, ":"
		Leer num
		
		Si num % 2 = 0 Entonces
			contadorPares <- contadorPares + 1
		Sino
			contadorImpares <- contadorImpares + 1
		FinSi
	FinPara
	
	Escribir "----------------------------------------"
	Escribir "Total de numeros ingresados: ", totalNumeros
	Escribir "Cantidad de numeros PARES: ", contadorPares
	Escribir "Cantidad de numeros IMPARES: ", contadorImpares
	Escribir "----------------------------------------"
FinAlgoritmo
