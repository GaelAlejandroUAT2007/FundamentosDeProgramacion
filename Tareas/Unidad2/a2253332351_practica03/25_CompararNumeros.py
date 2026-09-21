# CompararNumeros.py

numero1 = int(input("Introduce el primer numero: "))
numero2 = int(input("Introduce el segundo numero: "))

if numero1 >= numero2:
    if numero1 == numero2:
        print(f"Los numeros {numero1} y {numero2} son iguales")
    else:
        print(f"{numero1} es el mayor de los dos")
else:
    print(f"{numero2} es el mayor de los dos")
