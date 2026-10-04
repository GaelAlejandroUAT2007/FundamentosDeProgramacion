// Tarea05_25
// Boletín 2 - Ejercicio 3
//
// Enunciado: Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o
// impar.

Algoritmo Tarea05_25
  Definir n Como Entero
  Escribir "Introduzca un número (0 para terminar):"
  Leer n
  Mientras n <> 0 Hacer
    Si n MOD 2 = 0 Entonces
      Escribir "Par"
    Sino
      Escribir "Impar"
    FinSi
    Escribir "Introduzca un número (0 para terminar):"
    Leer n
  FinMientras
  Escribir "Fin del programa"
FinAlgoritmo
