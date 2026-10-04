// Tarea05_03
// Boletín 1 - Ejercicio 3
//
// Enunciado: Pedir el radio de una circunferencia y calcular su longitud. L = 2·π·r.

Algoritmo Tarea05_03
  Definir r,l Como Real
  Escribir "Introduce el radio de la circunferencia:"
  Leer r
  Si r < 0 Entonces
    Escribir "El radio no puede ser negativo"
  Sino
    l <- 2 * PI * r
    Escribir "La longitud de la circunferencia de radio ", r, " es: ", l
  FinSi
FinAlgoritmo
