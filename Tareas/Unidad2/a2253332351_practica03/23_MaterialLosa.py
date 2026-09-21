# MaterialLosa.py

x = float(input("Introduce la longitud de la losa (X) en metros: "))
y = float(input("Introduce el ancho de la losa (Y) en metros: "))
n = float(input("Introduce el espesor de la losa (N) en metros: "))

volumenLosa = x * y * n
volCemento = volumenLosa * (1.0 / 6)
volArena = volumenLosa * (2.0 / 6)
volGrava = volumenLosa * (3.0 / 6)
volAgua = volCemento * 0.5

print(f"El volumen de la losa es: {volumenLosa} m3")
print(f"Cemento necesario: {volCemento} m3")
print(f"Arena necesaria: {volArena} m3")
print(f"Grava necesaria: {volGrava} m3")
print(f"Agua necesaria: {volAgua} m3")
