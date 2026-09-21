# PropinaRestaurante.py

consumo = float(input("Ingrese el consumo: "))
porcentajePropina = float(input("Ingrese el porcentaje de propina: "))

propina = consumo * (porcentajePropina / 100)
total = consumo + propina

print(f"La propina es: {propina}")
print(f"El total a pagar es: {total}")
