// Tarea05_02
// Boletín 1 - Ejercicio 2
//
// Enunciado: Pedir el radio de un círculo y calcular su área. A = π·r².

Algoritmo Tarea05_02
  Definir r,a Como Real
  Escribir "Introduce el radio del círculo:"
  Leer r
  Si r < 0 Entonces
    Escribir "El radio no puede ser negativo"
  Sino
    a <- PI * r * r
    Escribir "El área del círculo de radio ", r, " es: ", a
  FinSi
FinAlgoritmo
