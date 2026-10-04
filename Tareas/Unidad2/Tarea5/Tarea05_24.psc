// Tarea05_24
// Boletín 2 - Ejercicio 2
//
// Enunciado: Leer un número e indicar si es positivo o negativo. El proceso se repetirá
// hasta que se introduzca un 0.

Algoritmo Tarea05_24
  Definir n Como Entero
  Escribir "Introduzca un número (0 para terminar):"
  Leer n
  Mientras n <> 0 Hacer
    Si n > 0 Entonces
      Escribir "Positivo"
    Sino
      Escribir "Negativo"
    FinSi
    Escribir "Introduzca un número (0 para terminar):"
    Leer n
  FinMientras
  Escribir "Fin del programa"
FinAlgoritmo
