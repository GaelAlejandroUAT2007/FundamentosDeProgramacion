Algoritmo Cociente_Residuo
        Definir divisor, dividendo, residuo, ciclo Como Entero

         ciclo <- 0
         Escribir "Introduce el valor de divisor: "
         Leer divisor
         Escribir "Introduce el valor del dividendo: "
         Leer dividendo
         residuo <- dividendo
         ciclo <- 0

         Repetir
                residuo <- residuo - divisor
                ciclo <- ciclo + 1
         Hasta Que divisor > residuo

        Escribir "El cociente = ", ciclo, " residuo ", residuo
 FinAlgoritmo
