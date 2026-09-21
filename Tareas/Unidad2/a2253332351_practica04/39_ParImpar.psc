Algoritmo ParImpar
    Definir numero, residuo Como Entero

    Escribir "Introduce un numero entero: "
    Leer numero

    residuo <- numero MOD 2

    Si residuo == 0 Entonces
        Escribir numero, " es PAR"
    SiNo
        Escribir numero, " es IMPAR"
FinSi
FinAlgoritmo
