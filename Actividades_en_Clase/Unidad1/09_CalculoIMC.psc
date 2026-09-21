Algoritmo Alg09_CalculoIMC
	Definir peso, estatura, imc Como Real
	Definir nombrePersona Como Caracter
	
	Escribir "=== CALCULADORA DE IMC ==="
	Escribir "Ingrese el nombre del paciente:"
	Leer nombrePersona
	Escribir "Ingrese el peso en Kilogramos (ej. 70.5):"
	Leer peso
	Escribir "Ingrese la estatura en Metros (ej. 1.75):"
	Leer estatura
	
	imc <- peso / (estatura * estatura)
	
	Escribir "----------------------------------------"
	Escribir "Paciente: ", nombrePersona
	Escribir "IMC calculado: ", imc
	
	Si imc < 18.5 Entonces
		Escribir "Diagnostico: Bajo peso"
	Sino
		Si imc < 25.0 Entonces
			Escribir "Diagnostico: Peso normal (Saludable)"
		Sino
			Si imc < 30.0 Entonces
				Escribir "Diagnostico: Sobrepeso"
			Sino
				Escribir "Diagnostico: Obesidad"
			FinSi
		FinSi
	FinSi
	Escribir "----------------------------------------"
FinAlgoritmo
