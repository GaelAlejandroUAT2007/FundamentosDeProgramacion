# PromedioPonderado.py

nota1 = float(input("Ingrese la primera calificación (peso 40%): "))
nota2 = float(input("Ingrese la segunda calificación (peso 60%): "))

peso1 = 0.4
peso2 = 0.6

promedio = (nota1 * peso1) + (nota2 * peso2)

print(f"El promedio ponderado es: {promedio}")
