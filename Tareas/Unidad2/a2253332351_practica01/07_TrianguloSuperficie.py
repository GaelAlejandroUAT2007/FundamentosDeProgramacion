# TrianguloSuperficie.py

x1 = float(input("Ingresa la cordenada de x1: "))
y1 = float(input("Ingresa la cordenada de y1: "))
x2 = float(input("Ingresa la cordenada de x2: "))
y2 = float(input("Ingresa la cordenada de y2: "))
x3 = float(input("Ingresa la cordenada de x3: "))
y3 = float(input("Ingresa la cordenada de y3: "))

area = (((x1 * y2) + (x2 * y3) + (x3 * y1)) - ((x1 * y3) + (x3 * y2) + (x2 * y1))) / 2

print(f"El área del triángulo es: {area}")
