# MayorDeTres.py

n1 = float(input("Introduce el primer numero: "))
n2 = float(input("Introduce el segundo numero: "))
n3 = float(input("Introduce el tercer numero: "))

if n1 >= n2 and n1 >= n3:
    mayor = n1
elif n2 >= n1 and n2 >= n3:
    mayor = n2
else:
    mayor = n3

print(f"El numero mayor es: {mayor}")
