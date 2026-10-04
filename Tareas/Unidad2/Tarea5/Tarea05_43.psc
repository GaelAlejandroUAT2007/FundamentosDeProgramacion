// Tarea05_43
// Boletín 2 - Ejercicio 21
//
// Enunciado: Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.

Algoritmo Tarea05_43
  Definir i,n Como Entero
  Definir hay Como Logico
  hay <- Falso
  Para i <- 1 Hasta 10 Hacer
    Escribir "Introduzca el número ", i, ":"
    Leer n
    Si n < 0 Entonces
      hay <- Verdadero
    FinSi
  FinPara
  Si hay Entonces
    Escribir "Sí se introdujo algún número negativo"
  Sino
    Escribir "No se introdujo ningún número negativo"
  FinSi
FinAlgoritmo
