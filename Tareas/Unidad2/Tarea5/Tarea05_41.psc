// Tarea05_41
// Boletín 2 - Ejercicio 19
//
// Enunciado: Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y
// suspensos.

Algoritmo Tarea05_41
  Definir i,nota,ap,co,su Como Entero
  ap <- 0
  co <- 0
  su <- 0
  Para i <- 1 Hasta 6 Hacer
    Escribir "Introduzca la nota ", i, ":"
    Leer nota
    Si nota >= 5 Entonces
      ap <- ap + 1
    Sino
      Si nota = 4 Entonces
        co <- co + 1
      Sino
        su <- su + 1
      FinSi
    FinSi
  FinPara
  Escribir "Aprobados: ", ap
  Escribir "Condicionados: ", co
  Escribir "Suspensos: ", su
FinAlgoritmo
