Algoritmo Alg10_ValidacionClaveAcceso
	Definir claveCorrecta, claveIngresada Como Caracter
	Definir intentos, maxIntentos Como Entero
	Definir accesoConcedido Como Entero
	
	claveCorrecta <- "1234Sistemas"
	intentos <- 0
	maxIntentos <- 3
	accesoConcedido <- 0
	
	Mientras intentos < maxIntentos Y accesoConcedido = 0 Hacer
		Escribir "Ingrese la clave de acceso:"
		Leer claveIngresada
		intentos <- intentos + 1
		
		Si claveIngresada = claveCorrecta Entonces
			accesoConcedido <- 1
		Sino
			Escribir "Clave incorrecta. Intentos restantes: ", (maxIntentos - intentos)
		FinSi
	FinMientras
	
	Escribir "----------------------------------------"
	Si accesoConcedido = 1 Entonces
		Escribir "ACCESO CONCEDIDO. Bienvenid@ al sistema."
	Sino
		Escribir "ACCESO BLOQUEADO. Se supero el numero maximo de intentos."
	FinSi
	Escribir "----------------------------------------"
FinAlgoritmo
