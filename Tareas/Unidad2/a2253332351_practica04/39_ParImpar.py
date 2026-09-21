# ParImpar.py

numero = int(input("Introduce un numero entero: "))

residuo = numero % 2

if residuo == 0:
    print(f"{numero} es PAR")
else:
    print(f"{numero} es IMPAR")
