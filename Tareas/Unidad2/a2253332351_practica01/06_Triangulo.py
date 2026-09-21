# Triangulo.py

import math

x1 = float(input("Ingresa la coordenada de x1: "))
y1 = float(input("Ingresa la coordenada de y1: "))
x2 = float(input("Ingresa la coordenada de x2: "))
y2 = float(input("Ingresa la coordenada de y2: "))
x3 = float(input("Ingresa la coordenada de x3: "))
y3 = float(input("Ingresa la coordenada de y3: "))

distancia1 = math.sqrt(math.pow((x1 - x2), 2) + math.pow((y1 - y2), 2))
distancia2 = math.sqrt(math.pow((x2 - x3), 2) + math.pow((y2 - y3), 2))
distancia3 = math.sqrt(math.pow((x3 - x1), 2) + math.pow((y3 - y1), 2))
perimetro = distancia1 + distancia2 + distancia3

print(f"El perímetro del triángulo es: {perimetro}")
