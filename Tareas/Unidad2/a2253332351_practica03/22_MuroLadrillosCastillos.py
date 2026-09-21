# MuroLadrillosCastillos.py

lMuro = float(input("Introduce la longitud del muro (X) en metros: "))
aMuro = float(input("Introduce la altura del muro (Y) en metros: "))
n = float(input("Introduce el numero de castillos (N): "))
pCastillo = float(input("Introduce la longitud de cada castillo (P) en metros: "))
largoLadrillo = float(input("Introduce el largo del ladrillo en metros: "))
altoLadrillo = float(input("Introduce la altura del ladrillo en metros: "))
juntaH = float(input("Introduce el espesor de la junta horizontal en metros: "))
juntaV = float(input("Introduce el espesor de la junta vertical en metros: "))

areaMuro = lMuro * aMuro
areaCastillos = n * pCastillo * aMuro
areaNeta = areaMuro - areaCastillos
areaLadrilloJunta = (altoLadrillo + juntaH) * (largoLadrillo + juntaV)
numLadrillos = areaNeta / areaLadrilloJunta

print(f"El area del muro es: {areaMuro} m2")
print(f"El area ocupada por los castillos es: {areaCastillos} m2")
print(f"El area neta a cubrir con ladrillo es: {areaNeta} m2")
print(f"El numero de ladrillos necesarios es: {numLadrillos}")
