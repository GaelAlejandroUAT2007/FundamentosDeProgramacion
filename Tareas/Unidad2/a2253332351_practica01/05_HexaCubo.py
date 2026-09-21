# HexaCubo.py

lado = float(input("Ingrese el valor del lado del Hexaedro o Cubo: "))

aBase = lado * lado
aLado = 4 * (lado * lado)
aTotal = 6 * lado * lado
volumen = lado * lado * lado

print(f"El Área de la Base es: {aBase}")
print(f"El Área Lateral es: {aLado}")
print(f"El Área Total es: {aTotal}")
print(f"El Volumen es: {volumen}")
