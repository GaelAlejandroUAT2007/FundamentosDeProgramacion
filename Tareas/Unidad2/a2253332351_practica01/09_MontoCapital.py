# MontoCapital.py

capital = float(input("Ingrese el capital: "))
interes = float(input("Ingrese la tasa de interés: "))

monto = capital * (1 + (interes / 100))

print(f"El monto es: {monto}")
