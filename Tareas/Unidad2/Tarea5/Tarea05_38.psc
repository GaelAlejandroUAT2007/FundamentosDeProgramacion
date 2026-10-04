// Tarea05_38
// Boletín 2 - Ejercicio 16
//
// Enunciado: Pedir un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar
// de dicho número.

Algoritmo Tarea05_38
  Definir n,i Como Entero
  Escribir "Introduzca un número entre 0 y 10:"
  Leer n
  Si n < 0 O n > 10 Entonces
    Escribir "El número debe estar entre 0 y 10"
  Sino
    Para i <- 1 Hasta 10 Hacer
      Escribir n, " x ", i, " = ", n * i
    FinPara
  FinSi
FinAlgoritmo
