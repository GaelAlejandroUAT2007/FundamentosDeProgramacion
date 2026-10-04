// Tarea05_01
// Boletín 1 - Ejercicio 1
//
// Enunciado: Pedir los coeficientes de una ecuación de 2º grado y mostrar sus soluciones
// reales. Si no existen, debe indicarlo.

Algoritmo Tarea05_01
  Definir a,b,c,d,x1,x2 Como Real
  Escribir "Introduzca primer coeficiente (a):"
  Leer a
  Escribir "Introduzca segundo coeficiente (b):"
  Leer b
  Escribir "Introduzca tercer coeficiente (c):"
  Leer c
  Si a = 0 Entonces
    Escribir "Error: el coeficiente a debe ser diferente de cero"
  Sino
    d <- b*b - 4*a*c
    Si d < 0 Entonces
      Escribir "No existen soluciones reales"
    Sino
      x1 <- (-b + RC(d)) / (2*a)
      x2 <- (-b - RC(d)) / (2*a)
      Escribir "Solución 1: ", x1
      Escribir "Solución 2: ", x2
    FinSi
  FinSi
FinAlgoritmo
