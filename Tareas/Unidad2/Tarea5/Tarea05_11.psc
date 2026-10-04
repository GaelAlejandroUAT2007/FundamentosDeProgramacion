// Tarea05_11
// Boletín 1 - Ejercicio 11
//
// Enunciado: Pedir un número entre 0 y 9.999 y decir cuántas cifras tiene.

Algoritmo Tarea05_11
  Definir n,c Como Entero
  Escribir "Introduce un número entre 0 y 9999:"
  Leer n
  Si n < 0 O n > 9999 Entonces
    Escribir "Número fuera de rango"
  Sino
    Si n < 10 Entonces
      c <- 1
    Sino
      Si n < 100 Entonces
        c <- 2
      Sino
        Si n < 1000 Entonces
          c <- 3
        Sino
          c <- 4
        FinSi
      FinSi
    FinSi
    Escribir "Cantidad de cifras: ", c
  FinSi
FinAlgoritmo
