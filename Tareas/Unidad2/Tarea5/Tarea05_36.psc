// Tarea05_36
// Boletín 2 - Ejercicio 14
//
// Enunciado: Pedir 10 sueldos. Mostrar su suma y cuántos hay mayores de 1000 €.

Algoritmo Tarea05_36
  Definir i,cont Como Entero
  Definir sueldo,suma Como Real
  suma <- 0
  cont <- 0
  Para i <- 1 Hasta 10 Hacer
    Escribir "Introduzca el sueldo ", i, ":"
    Leer sueldo
    suma <- suma + sueldo
    Si sueldo > 1000 Entonces
      cont <- cont + 1
    FinSi
  FinPara
  Escribir "Suma de sueldos: ", suma
  Escribir "Sueldos mayores de 1000: ", cont
FinAlgoritmo
