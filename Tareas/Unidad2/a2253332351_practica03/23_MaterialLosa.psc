Algoritmo Material_Losa
        Definir X, Y, N Como Real
        Definir volumenLosa, volCemento, volArena, volGrava, volAgua Como Real

         Escribir "Introduce la longitud de la losa (X) en metros: "
         Leer X
         Escribir "Introduce el ancho de la losa (Y) en metros: "
         Leer Y
         Escribir "Introduce el espesor de la losa (N) en metros: "
         Leer N

         volumenLosa <- X * Y * N
         volCemento <- volumenLosa * (1/6)
         volArena <- volumenLosa * (2/6)
         volGrava <- volumenLosa * (3/6)
         volAgua <- volCemento * 0.5

        Escribir "El volumen de la losa es: ", volumenLosa, " m3"
        Escribir "Cemento necesario: ", volCemento, " m3"
        Escribir "Arena necesaria: ", volArena, " m3"
        Escribir "Grava necesaria: ", volGrava, " m3"
        Escribir "Agua necesaria: ", volAgua, " m3"
 FinAlgoritmo
