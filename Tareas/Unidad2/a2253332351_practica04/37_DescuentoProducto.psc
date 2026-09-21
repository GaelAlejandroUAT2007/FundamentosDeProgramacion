Algoritmo DescuentoProducto
    Definir precio, porcentaje, descuento, totalPagar Como Real

    Escribir "Ingrese el precio del producto: "
    Leer precio
    Escribir "Ingrese el porcentaje de descuento: "
    Leer porcentaje

    descuento <- precio * (porcentaje / 100)
    totalPagar <- precio - descuento

    Escribir "El descuento es: ", descuento
    Escribir "El total a pagar es: ", totalPagar
FinAlgoritmo
