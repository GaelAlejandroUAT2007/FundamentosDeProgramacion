Algoritmo Alg02_ClasificacionEdades
	Definir edad Como Entero
	Definir nombre Como Caracter
	
	Escribir "=== CLASIFICACION DE EDADES ==="
	Escribir "Ingrese su nombre:"
	Leer nombre
	Escribir "Ingrese su edad:"
	Leer edad
	
	Escribir "----------------------------------------"
	Escribir "Persona: ", nombre
	Si edad >= 0 Y edad <= 12 Entonces
		Escribir "Categoria: Niño / Niña"
	Sino
		Si edad >= 13 Y edad <= 17 Entonces
			Escribir "Categoria: Adolescente"
		Sino
			Si edad >= 18 Y edad <= 59 Entonces
				Escribir "Categoria: Adulto"
			Sino
				Si edad >= 60 Entonces
					Escribir "Categoria: Adulto Mayor"
				Sino
					Escribir "Edad no valida."
				FinSi
			FinSi
		FinSi
	FinSi
	Escribir "----------------------------------------"
FinAlgoritmo
