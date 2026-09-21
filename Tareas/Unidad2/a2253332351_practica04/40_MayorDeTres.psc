Algoritmo MayorDeTres
    Definir n1, n2, n3, mayor Como Real

    Escribir "Introduce el primer numero: "
    Leer n1
    Escribir "Introduce el segundo numero: "
    Leer n2
    Escribir "Introduce el tercer numero: "
    Leer n3

    Si n1 >= n2 Y n1 >= n3 Entonces
        mayor <- n1
    SiNo
        Si n2 >= n1 Y n2 >= n3 Entonces
            mayor <- n2
        SiNo
            mayor <- n3
        FinSi
    FinSi

    Escribir "El numero mayor es: ", mayor
FinAlgoritmo
