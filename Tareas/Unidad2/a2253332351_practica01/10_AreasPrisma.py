# AreasPrisma.py

perimetro = float(input("Ingresa el perimetro de la Base: "))
apotema = float(input("Ingresa la apotema: "))
altura = float(input("Ingresa la altura: "))

aBase = (perimetro * apotema) / 2
aLateral = (perimetro * altura) / 2
aTotal = (2 * aBase) + aLateral

print(f"El área de la base es: {aBase}")
print(f"El área lateral es: {aLateral}")
print(f"El área total es: {aTotal}")
