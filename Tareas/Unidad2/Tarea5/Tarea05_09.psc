// Tarea05_09
// Boletín 1 - Ejercicio 9
//
// Enunciado: Pedir dos números y mostrarlos ordenados de mayor a menor.

Algoritmo Tarea05_09
  Definir a,b,aux Como Entero
  Escribir "Introduce un número:"
  Leer a
  Escribir "Introduce otro número:"
  Leer b
  Si a < b Entonces
    aux <- a
    a <- b
    b <- aux
  FinSi
  Escribir "De mayor a menor: ", a, " ", b
FinAlgoritmo
