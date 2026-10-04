// Tarea05_18
// Boletín 1 - Ejercicio 18
//
// Enunciado: Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días
// (febrero tiene siempre 28 días).

Algoritmo Tarea05_18
  Definir d,m,a,dm Como Entero
  Escribir "Introduce el día:"
  Leer d
  Escribir "Introduce el mes:"
  Leer m
  Escribir "Introduce el año:"
  Leer a
  Segun m Hacer
    1,3,5,7,8,10,12:
      dm <- 31
    4,6,9,11:
      dm <- 30
    De Otro Modo:
      dm <- 28
  FinSegun
  d <- d + 1
  Si d > dm Entonces
    d <- 1
    m <- m + 1
    Si m > 12 Entonces
      m <- 1
      a <- a + 1
    FinSi
  FinSi
  Escribir "Fecha del día siguiente: ", d, "/", m, "/", a
FinAlgoritmo
