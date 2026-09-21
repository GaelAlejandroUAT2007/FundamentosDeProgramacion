Algoritmo Alg06_ConversorTemperatura
	Definir opcion Como Entero
	Definir tempOrigen, tempResultado Como Real
	
	Escribir "=== CONVERSOR DE TEMPERATURA ==="
	Escribir "1. Celsius a Fahrenheit"
	Escribir "2. Fahrenheit a Celsius"
	Escribir "3. Celsius a Kelvin"
	Escribir "4. Kelvin a Celsius"
	Escribir "Elija una opcion (1-4):"
	Leer opcion
	
	Segun opcion Hacer
		1:
			Escribir "Ingrese los grados Celsius:"
			Leer tempOrigen
			tempResultado <- (tempOrigen * 9/5) + 32
			Escribir tempOrigen, " °C equivalen a ", tempResultado, " °F"
		2:
			Escribir "Ingrese los grados Fahrenheit:"
			Leer tempOrigen
			tempResultado <- (tempOrigen - 32) * 5/9
			Escribir tempOrigen, " °F equivalen a ", tempResultado, " °C"
		3:
			Escribir "Ingrese los grados Celsius:"
			Leer tempOrigen
			tempResultado <- tempOrigen + 273.15
			Escribir tempOrigen, " °C equivalen a ", tempResultado, " K"
		4:
			Escribir "Ingrese los grados Kelvin:"
			Leer tempOrigen
			tempResultado <- tempOrigen - 273.15
			Escribir tempOrigen, " K equivalen a ", tempResultado, " °C"
		De Otro Modo:
			Escribir "Opcion no valida."
	FinSegun
FinAlgoritmo
