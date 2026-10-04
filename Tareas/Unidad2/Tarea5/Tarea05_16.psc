// Tarea05_16
// Boletín 1 - Ejercicio 16
//
// Enunciado: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con
// meses de 28, 30 y 31 días. Sin años bisiestos.

Algoritmo Tarea05_16
  Definir d,m,a,dm Como Entero
  Escribir "Introduce el día:"
  Leer d
  Escribir "Introduce el mes:"
  Leer m
  Escribir "Introduce el año:"
  Leer a
  dm <- 0
  Si a >= 1 Entonces
    Segun m Hacer
      1,3,5,7,8,10,12:
        dm <- 31
      4,6,9,11:
        dm <- 30
      2:
        dm <- 28
    FinSegun
  FinSi
  Si d >= 1 Y d <= dm Entonces
    Escribir "La fecha es correcta"
  Sino
    Escribir "La fecha NO es correcta"
  FinSi
FinAlgoritmo
