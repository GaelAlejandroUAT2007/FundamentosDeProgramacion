// Tarea05_33
// Boletín 2 - Ejercicio 11
//
// Enunciado: Diseñar un programa que muestre el producto de los 10 primeros números impares.

Algoritmo Tarea05_33
  Definir i,prod Como Entero
  prod <- 1
  Para i <- 1 Hasta 10 Hacer
    prod <- prod * (2*i - 1)
  FinPara
  Escribir "El producto de los 10 primeros impares es: ", prod
FinAlgoritmo
