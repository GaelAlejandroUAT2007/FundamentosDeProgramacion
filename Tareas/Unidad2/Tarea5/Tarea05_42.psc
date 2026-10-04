// Tarea05_42
// Boletín 2 - Ejercicio 20
//
// Enunciado: Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.

Algoritmo Tarea05_42
  Definir n,i Como Entero
  Definir sueldo,max Como Real
  Escribir "¿Cuántos sueldos va a introducir?"
  Leer n
  Si n < 1 Entonces
    Escribir "N debe ser mayor o igual que 1"
  Sino
    Escribir "Introduzca el sueldo 1:"
    Leer sueldo
    max <- sueldo
    Para i <- 2 Hasta n Hacer
      Escribir "Introduzca el sueldo ", i, ":"
      Leer sueldo
      Si sueldo > max Entonces
        max <- sueldo
      FinSi
    FinPara
    Escribir "El sueldo máximo es: ", max
  FinSi
FinAlgoritmo
