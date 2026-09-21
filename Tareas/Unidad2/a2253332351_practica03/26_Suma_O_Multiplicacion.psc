Algoritmo Suma_O_Multiplicacion
        Definir numero1, numero2, numero3, resultado Como Entero

         Escribir "Introduce el primer numero: "
         Leer numero1
         Escribir "Introduce el segundo numero: "
         Leer numero2
         Escribir "Introduce el tercer numero: "
         Leer numero3

         Si (numero1 < 0) Entonces
                resultado <- numero1 + numero2 + numero3
         SiNo
                resultado <- numero1 * numero2 * numero3
         FinSi

        Escribir "El resultado es: ", resultado
 FinAlgoritmo
