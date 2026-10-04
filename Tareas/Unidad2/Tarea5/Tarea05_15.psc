// Tarea05_15
// Boletín 1 - Ejercicio 15
//
// Enunciado: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
// Suponiendo todos los meses de 30 días.

Algoritmo Tarea05_15
  Definir d,m,a Como Entero
  Escribir "Introduce el día:"
  Leer d
  Escribir "Introduce el mes:"
  Leer m
  Escribir "Introduce el año:"
  Leer a
  Si a >= 1 Y m >= 1 Y m <= 12 Y d >= 1 Y d <= 30 Entonces
    Escribir "La fecha es correcta"
  Sino
    Escribir "La fecha NO es correcta"
  FinSi
FinAlgoritmo
