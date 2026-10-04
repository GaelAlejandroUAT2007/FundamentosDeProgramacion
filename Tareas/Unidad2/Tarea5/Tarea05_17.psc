// Tarea05_17
// Boletín 1 - Ejercicio 17
//
// Enunciado: Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día
// siguiente. Suponer que todos los meses tienen 30 días.

Algoritmo Tarea05_17
  Definir d,m,a Como Entero
  Escribir "Introduce el día:"
  Leer d
  Escribir "Introduce el mes:"
  Leer m
  Escribir "Introduce el año:"
  Leer a
  d <- d + 1
  Si d > 30 Entonces
    d <- 1
    m <- m + 1
    Si m > 12 Entonces
      m <- 1
      a <- a + 1
    FinSi
  FinSi
  Escribir "Fecha del día siguiente: ", d, "/", m, "/", a
FinAlgoritmo
