// Tarea05_20
// Boletín 1 - Ejercicio 20
//
// Enunciado: Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el
// segundo siguiente.

Algoritmo Tarea05_20
  Definir h,mi,s Como Entero
  Escribir "Introduce las horas:"
  Leer h
  Escribir "Introduce los minutos:"
  Leer mi
  Escribir "Introduce los segundos:"
  Leer s
  s <- s + 1
  Si s = 60 Entonces
    s <- 0
    mi <- mi + 1
    Si mi = 60 Entonces
      mi <- 0
      h <- h + 1
      Si h = 24 Entonces
        h <- 0
      FinSi
    FinSi
  FinSi
  Escribir "Hora siguiente: " Sin Saltar
  Si h < 10 Entonces
    Escribir "0" Sin Saltar
  FinSi
  Escribir h Sin Saltar
  Escribir ":" Sin Saltar
  Si mi < 10 Entonces
    Escribir "0" Sin Saltar
  FinSi
  Escribir mi Sin Saltar
  Escribir ":" Sin Saltar
  Si s < 10 Entonces
    Escribir "0" Sin Saltar
  FinSi
  Escribir s
FinAlgoritmo
