// Tarea05_49
// Boletín 3 - Ejercicio 4
//
// Enunciado: Dibuja un cuadrado de n elementos de lado utilizando *.

Algoritmo Tarea05_49
  Definir n,i,j Como Entero
  Escribir "Introduzca el lado del cuadrado:"
  Leer n
  Si n < 1 Entonces
    Escribir "El lado debe ser mayor o igual que 1"
  Sino
    Para i <- 1 Hasta n Hacer
      Para j <- 1 Hasta n Hacer
        Escribir "* " Sin Saltar
      FinPara
      Escribir ""
    FinPara
  FinSi
FinAlgoritmo
