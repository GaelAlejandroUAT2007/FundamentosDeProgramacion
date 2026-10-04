// Tarea05_28
// Boletín 2 - Ejercicio 6
//
// Enunciado: Pedir números hasta que se teclee un 0, mostrar la suma de todos los números
// introducidos.

Algoritmo Tarea05_28
  Definir n,suma Como Entero
  suma <- 0
  Escribir "Introduzca un número (0 para terminar):"
  Leer n
  Mientras n <> 0 Hacer
    suma <- suma + n
    Escribir "Introduzca un número (0 para terminar):"
    Leer n
  FinMientras
  Escribir "La suma total es: ", suma
FinAlgoritmo
