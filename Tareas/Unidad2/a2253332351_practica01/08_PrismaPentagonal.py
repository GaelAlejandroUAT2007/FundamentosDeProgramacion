# PrismaPentagonal.py

perimetro = float(input("Ingresa el perimetro de la Base: "))
apotema = float(input("Ingresa la apotema: "))
altura = float(input("Ingresa la altura: "))

aBase = (perimetro * apotema) / 2
aLado = perimetro * altura
aTotal = (2 * aBase) + aLado
volumen = aBase * altura

print(f"El área de la base es: {aBase}")
print(f"El área lateral es: {aLado}")
print(f"El área total es: {aTotal}")
print(f"El volumen del prisma pentagonal es: {volumen}")
