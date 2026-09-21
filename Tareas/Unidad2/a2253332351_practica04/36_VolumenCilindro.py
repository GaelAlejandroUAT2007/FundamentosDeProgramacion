# VolumenCilindro.py

radio = float(input("Ingrese el radio del cilindro: "))
altura = float(input("Ingrese la altura del cilindro: "))

PI = 3.14159265358979323846

aBase = PI * (radio * radio)
aLateral = 2 * PI * radio * altura
aTotal = aLateral + (2 * aBase)
volumen = aBase * altura

print(f"El área de la base es: {aBase}")
print(f"El área lateral es: {aLateral}")
print(f"El área total es: {aTotal}")
print(f"El volumen del cilindro es: {volumen}")
