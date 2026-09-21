# AreaCirculoDiametro.py

diametro = float(input("Ingrese el diámetro del círculo: "))

PI = 3.14159265358979323846

radio = diametro / 2
area = PI * (radio * radio)
circunferencia = 2 * PI * radio

print(f"El radio es: {radio}")
print(f"El área es: {area}")
print(f"La circunferencia es: {circunferencia}")
