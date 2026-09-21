# AreaCono.py

radio = float(input("Ingresa el radio del cono: "))
generatriz = float(input("Ingresa la generatriz del cono: "))
altura = float(input("Ingresa la altura del cono: "))

PI = 3.14159265358979323846

aBase = PI * (radio * radio)
aLado = PI * radio * generatriz
aTotal = aBase + aLado
volumen = (aBase * altura) / 3

print(f"El área de la base es: {aBase}")
print(f"El área lateral es: {aLado}")
print(f"El área total es: {aTotal}")
print(f"El volumen es: {volumen}")
