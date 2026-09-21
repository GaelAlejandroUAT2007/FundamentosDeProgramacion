# VentaConIva.py

cantidad = int(input("Cantidad vendida: "))
precioUnitario = float(input("Precio unitario: "))

subtotal = cantidad * precioUnitario
iva = subtotal * 0.16
total = subtotal + iva

print(f"El subtotal es: {subtotal}")
print(f"El iva es: {iva}")
print(f"El total es: {total}")
