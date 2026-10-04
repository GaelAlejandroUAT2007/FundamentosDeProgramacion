// Tarea05_29
// Boletín 2 - Ejercicio 7
//
// Enunciado: Pedir números hasta que se introduzca uno negativo, y calcular la media.

Algoritmo Tarea05_29
  Definir n,suma,media Como Real
  Definir cont Como Entero
  suma <- 0
  cont <- 0
  Escribir "Introduzca un número (negativo para terminar):"
  Leer n
  Mientras n >= 0 Hacer
    suma <- suma + n
    cont <- cont + 1
    Escribir "Introduzca un número (negativo para terminar):"
    Leer n
  FinMientras
  Si cont = 0 Entonces
    Escribir "No se introdujeron números"
  Sino
    media <- suma / cont
    Escribir "La media es: ", media
  FinSi
FinAlgoritmo
