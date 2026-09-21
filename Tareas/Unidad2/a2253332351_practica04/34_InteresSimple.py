# InteresSimple.py

capital = float(input("Ingrese el capital inicial: "))
tasa = float(input("Ingrese la tasa de interés anual (%): "))
tiempo = float(input("Ingrese el tiempo en años: "))

interes = (capital * tasa * tiempo) / 100
monto = capital + interes

print(f"El interés generado es: {interes}")
print(f"El monto final es: {monto}")
