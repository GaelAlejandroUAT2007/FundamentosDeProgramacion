# SumaOMultiplicacion.py

numero1 = int(input("Introduce el primer numero: "))
numero2 = int(input("Introduce el segundo numero: "))
numero3 = int(input("Introduce el tercer numero: "))

if numero1 < 0:
    resultado = numero1 + numero2 + numero3
else:
    resultado = numero1 * numero2 * numero3

print(f"El resultado es: {resultado}")
