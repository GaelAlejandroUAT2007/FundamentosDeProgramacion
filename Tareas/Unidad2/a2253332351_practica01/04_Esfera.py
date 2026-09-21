# Esfera.py

radio = float(input("Introduzca el valor del radio: "))

PI = 3.14159265358979323846

area = (4 * PI) * (radio * radio)
volumen = ((4 * PI) * ((radio * radio) * radio)) / 3

print(f"El área de la esfera es: {area}")
print(f"El volumen de la esfera es: {volumen}")
