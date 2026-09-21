# DescuentoProducto.py

precio = float(input("Ingrese el precio del producto: "))
porcentaje = float(input("Ingrese el porcentaje de descuento: "))

descuento = precio * (porcentaje / 100)
totalPagar = precio - descuento

print(f"El descuento es: {descuento}")
print(f"El total a pagar es: {totalPagar}")
