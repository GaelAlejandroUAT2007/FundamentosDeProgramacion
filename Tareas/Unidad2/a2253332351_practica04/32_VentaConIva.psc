Algoritmo Venta_Con_Iva
        Definir cantidad Como Entero
        Definir precioUnitario, subtotal, iva, total Como Real

         Escribir "Cantidad vendida: "
         Leer cantidad
         Escribir "Precio unitario: "
         Leer precioUnitario

         subtotal <- cantidad * precioUnitario
         iva <- subtotal * 0.16
         total <- subtotal + iva

        Escribir "El subtotal es: ", subtotal
        Escribir "El iva es: ", iva
        Escribir "El total es: ", total
 FinAlgoritmo
