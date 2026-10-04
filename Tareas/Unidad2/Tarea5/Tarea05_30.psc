// Tarea05_30
// Boletín 2 - Ejercicio 8
//
// Enunciado: Pedir un número N, y mostrar todos los números del 1 al N.

Algoritmo Tarea05_30
  Definir n,i Como Entero
  Escribir "Introduzca un número N:"
  Leer n
  Si n < 1 Entonces
    Escribir "N debe ser mayor o igual que 1"
  Sino
    Para i <- 1 Hasta n Hacer
      Escribir i
    FinPara
  FinSi
FinAlgoritmo
