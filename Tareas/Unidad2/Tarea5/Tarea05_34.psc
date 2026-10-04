// Tarea05_34
// Boletín 2 - Ejercicio 12
//
// Enunciado: Pedir un número y calcular su factorial.

Algoritmo Tarea05_34
  Definir n,i Como Entero
  Definir fact Como Real
  Escribir "Introduzca un número (0 a 20):"
  Leer n
  Si n < 0 O n > 20 Entonces
    Escribir "Número fuera de rango (0 a 20)"
  Sino
    fact <- 1
    Para i <- 1 Hasta n Hacer
      fact <- fact * i
    FinPara
    Escribir "El factorial de ", n, " es ", fact
  FinSi
FinAlgoritmo
