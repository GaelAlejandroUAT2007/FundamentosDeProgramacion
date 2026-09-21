Algoritmo Alg07_SimuladorCajero
	Definir opcion Como Entero
	Definir saldo, monto Como Real
	
	saldo <- 5000.00
	opcion <- 0
	
	Mientras opcion <> 4 Hacer
		Escribir "=== CAJERO AUTOMATICO ==="
		Escribir "1. Consultar saldo"
		Escribir "2. Depositar dinero"
		Escribir "3. Retirar dinero"
		Escribir "4. Salir"
		Escribir "Seleccione una opcion:"
		Leer opcion
		
		Segun opcion Hacer
			1:
				Escribir "Su saldo actual es: $", saldo
			2:
				Escribir "Ingrese el monto a depositar:"
				Leer monto
				Si monto > 0 Entonces
					saldo <- saldo + monto
					Escribir "Deposito exitoso. Nuevo saldo: $", saldo
				Sino
					Escribir "Monto invalido."
				FinSi
			3:
				Escribir "Ingrese el monto a retirar:"
				Leer monto
				Si monto > 0 Entonces
					Si monto <= saldo Entonces
						saldo <- saldo - monto
						Escribir "Retiro exitoso. Nuevo saldo: $", saldo
					Sino
						Escribir "Saldo insuficiente."
					FinSi
				Sino
					Escribir "Monto invalido."
				FinSi
			4:
				Escribir "Gracias por utilizar el cajero automatico."
			De Otro Modo:
				Escribir "Opcion no valida."
		FinSegun
		Escribir ""
	FinMientras
FinAlgoritmo
