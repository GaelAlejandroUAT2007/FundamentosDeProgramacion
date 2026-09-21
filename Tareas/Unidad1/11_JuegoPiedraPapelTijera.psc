Algoritmo Alg11_JuegoPiedraPapelTijera
	Definir eleccionUsuario, eleccionSistema Como Entero
	
	Escribir "=== PIEDRA, PAPEL O TIJERA ==="
	Escribir "Elige tu opcion:"
	Escribir "1. Piedra"
	Escribir "2. Papel"
	Escribir "3. Tijera"
	Leer eleccionUsuario
	
	// Simulamos eleccion fija del sistema como 2 (Papel) por simplicidad didactica
	eleccionSistema <- 2
	
	Escribir "----------------------------------------"
	Si eleccionUsuario = 1 Entonces
		Escribir "Tu elegiste: Piedra"
	Sino
		Si eleccionUsuario = 2 Entonces
			Escribir "Tu elegiste: Papel"
		Sino
			Escribir "Tu elegiste: Tijera"
		FinSi
	FinSi
	
	Escribir "El sistema eligio: Papel"
	
	Si eleccionUsuario = eleccionSistema Entonces
		Escribir "Resultado: EMPATE"
	Sino
		Si (eleccionUsuario = 1 Y eleccionSistema = 3) O (eleccionUsuario = 2 Y eleccionSistema = 1) O (eleccionUsuario = 3 Y eleccionSistema = 2) Entonces
			Escribir "Resultado: ¡GANASTE!"
		Sino
			Escribir "Resultado: PERDISTE"
		FinSi
	FinSi
	Escribir "----------------------------------------"
FinAlgoritmo
