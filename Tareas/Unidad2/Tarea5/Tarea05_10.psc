// Tarea05_10
// Boletín 1 - Ejercicio 10
//
// Enunciado: Pedir tres números y mostrarlos ordenados de mayor a menor.

Algoritmo Tarea05_10
  Definir a,b,c,aux Como Entero
  Escribir "Introduce el primer número:"
  Leer a
  Escribir "Introduce el segundo número:"
  Leer b
  Escribir "Introduce el tercer número:"
  Leer c
  Si a < b Entonces
    aux <- a
    a <- b
    b <- aux
  FinSi
  Si a < c Entonces
    aux <- a
    a <- c
    c <- aux
  FinSi
  Si b < c Entonces
    aux <- b
    b <- c
    c <- aux
  FinSi
  Escribir "De mayor a menor: ", a, " ", b, " ", c
FinAlgoritmo
