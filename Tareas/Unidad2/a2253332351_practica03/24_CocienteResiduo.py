# CocienteResiduo.py

divisor = int(input("Introduce el valor de divisor: "))
dividendo = int(input("Introduce el valor del dividendo: "))

residuo = dividendo
ciclo = 0

while divisor <= residuo:
    residuo = residuo - divisor
    ciclo = ciclo + 1

print(f"El cociente = {ciclo} residuo {residuo}")
