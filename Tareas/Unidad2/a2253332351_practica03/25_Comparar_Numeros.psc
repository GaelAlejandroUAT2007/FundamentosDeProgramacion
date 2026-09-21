Algoritmo Comparar_Numeros
        Definir numero1, numero2 Como Entero

         Escribir "Introduce el primer numero: "
         Leer numero1
         Escribir "Introduce el segundo numero: "
         Leer numero2

        Si (numero1 >= numero2) Entonces
               Si (numero1 = numero2) Entonces
                       Escribir "Los numeros ", numero1, " y ", numero2, " son iguales"
               SiNo
                       Escribir numero1, " es el mayor de los dos"
               FinSi
        SiNo
               Escribir numero2, " es el mayor de los dos"
        FinSi
 FinAlgoritmo
