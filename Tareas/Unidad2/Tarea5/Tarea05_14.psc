// Tarea05_14
// Boletín 1 - Ejercicio 14
//
// Enunciado: Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente,
// Bien...

Algoritmo Tarea05_14
  Definir nota Como Entero
  Escribir "Introduzca una nota (0 a 10):"
  Leer nota
  Segun nota Hacer
    0,1,2,3,4:
      Escribir "Insuficiente"
    5:
      Escribir "Suficiente"
    6:
      Escribir "Bien"
    7,8:
      Escribir "Notable"
    9,10:
      Escribir "Sobresaliente"
    De Otro Modo:
      Escribir "Nota no válida (debe estar entre 0 y 10)"
  FinSegun
FinAlgoritmo
