// Tarea05_44
// Boletín 2 - Ejercicio 22
//
// Enunciado: Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.

Algoritmo Tarea05_44
  Definir i,nota Como Entero
  Definir susp Como Logico
  susp <- Falso
  Para i <- 1 Hasta 5 Hacer
    Escribir "Introduzca la calificación ", i, ":"
    Leer nota
    Si nota < 5 Entonces
      susp <- Verdadero
    FinSi
  FinPara
  Si susp Entonces
    Escribir "Hay al menos un suspenso"
  Sino
    Escribir "No hay suspensos"
  FinSi
FinAlgoritmo
