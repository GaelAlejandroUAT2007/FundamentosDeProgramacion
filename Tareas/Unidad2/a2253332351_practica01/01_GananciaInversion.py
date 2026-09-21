# GananciaInversion.py

capital = float(input("Ingrese el monto a invertir: "))
dias = int(input("Ingrese el número de días del mes: "))

interes = 0.02

ganancia = capital * dias * interes

print(f"La ganancia es: {ganancia}")
