// Tarea05_23
// Boletín 2 - Ejercicio 1
//
// Enunciado: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se
// introduzca un número negativo.

Algoritmo Tarea05_23
  Definir n,c Como Entero
  Escribir "Introduzca un número (negativo para terminar):"
  Leer n
  Mientras n >= 0 Hacer
    c <- n * n
    Escribir "El cuadrado de ", n, " es ", c
    Escribir "Introduzca un número (negativo para terminar):"
    Leer n
  FinMientras
  Escribir "Fin del programa"
FinAlgoritmo
