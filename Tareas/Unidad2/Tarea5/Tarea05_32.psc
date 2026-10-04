// Tarea05_32
// Boletín 2 - Ejercicio 10
//
// Enunciado: Pedir 15 números y escribir la suma total.

Algoritmo Tarea05_32
  Definir i,n,suma Como Entero
  suma <- 0
  Para i <- 1 Hasta 15 Hacer
    Escribir "Introduzca el número ", i, ":"
    Leer n
    suma <- suma + n
  FinPara
  Escribir "La suma total es: ", suma
FinAlgoritmo
