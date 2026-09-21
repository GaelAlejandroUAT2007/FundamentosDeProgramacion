Algoritmo Muro_Ladrillos_Castillos
        Definir Lmuro, Amuro, N, Pcastillo Como Real
        Definir largoLadrillo, altoLadrillo, juntaH, juntaV Como Real
        Definir areaMuro, areaCastillos, areaNeta Como Real
        Definir areaLadrilloJunta, numLadrillos Como Real

         Escribir "Introduce la longitud del muro (X) en metros: "
         Leer Lmuro
         Escribir "Introduce la altura del muro (Y) en metros: "
         Leer Amuro
         Escribir "Introduce el numero de castillos (N): "
         Leer N
         Escribir "Introduce la longitud de cada castillo (P) en metros: "
         Leer Pcastillo
         Escribir "Introduce el largo del ladrillo en metros: "
         Leer largoLadrillo
         Escribir "Introduce la altura del ladrillo en metros: "
         Leer altoLadrillo
         Escribir "Introduce el espesor de la junta horizontal en metros: "
         Leer juntaH
         Escribir "Introduce el espesor de la junta vertical en metros: "
         Leer juntaV

         areaMuro <- Lmuro * Amuro
         areaCastillos <- N * Pcastillo * Amuro
         areaNeta <- areaMuro - areaCastillos
         areaLadrilloJunta <- (altoLadrillo + juntaH) * (largoLadrillo + juntaV)
         numLadrillos <- areaNeta / areaLadrilloJunta

        Escribir "El area del muro es: ", areaMuro, " m2"
        Escribir "El area ocupada por los castillos es: ", areaCastillos, " m2"
        Escribir "El area neta a cubrir con ladrillo es: ", areaNeta, " m2"
        Escribir "El numero de ladrillos necesarios es: ", numLadrillos
 FinAlgoritmo
