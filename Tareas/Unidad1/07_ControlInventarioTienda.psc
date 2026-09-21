Algoritmo Alg07_ControlInventarioTienda
	Definir stockActual, opcion, cantidad Como Entero
	
	stockActual <- 100
	opcion <- 0
	
	Mientras opcion <> 3 Hacer
		Escribir "=== CONTROL DE INVENTARIO (Stock: ", stockActual, ") ==="
		Escribir "1. Registrar entrada (Comprar/Surtir)"
		Escribir "2. Registrar salida (Vender)"
		Escribir "3. Salir"
		Escribir "Seleccione una opcion:"
		Leer opcion
		
		Segun opcion Hacer
			1:
				Escribir "Ingrese cantidad a agregar al stock:"
				Leer cantidad
				Si cantidad > 0 Entonces
					stockActual <- stockActual + cantidad
					Escribir "Stock actualizado. Nuevo stock: ", stockActual
				Sino
					Escribir "Cantidad invalida."
				FinSi
			2:
				Escribir "Ingrese cantidad a retirar del stock:"
				Leer cantidad
				Si cantidad > 0 Entonces
					Si cantidad <= stockActual Entonces
						stockActual <- stockActual - cantidad
						Escribir "Venta registrada. Nuevo stock: ", stockActual
					Sino
						Escribir "Error: No hay suficiente stock disponible."
					FinSi
				Sino
					Escribir "Cantidad invalida."
				FinSi
			3:
				Escribir "Saliendo del sistema de inventario..."
			De Otro Modo:
				Escribir "Opcion no valida."
		FinSegun
		Escribir ""
	FinMientras
FinAlgoritmo
