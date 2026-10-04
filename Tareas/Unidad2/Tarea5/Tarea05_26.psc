// Tarea05_26
// Boletín 2 - Ejercicio 4
//
// Enunciado: Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se
// han introducido.

Algoritmo Tarea05_26
  Definir n,cont Como Entero
  cont <- 0
  Escribir "Introduzca un número (negativo para terminar):"
  Leer n
  Mientras n >= 0 Hacer
    cont <- cont + 1
    Escribir "Introduzca un número (negativo para terminar):"
    Leer n
  FinMientras
  Escribir "Números introducidos: ", cont
FinAlgoritmo
