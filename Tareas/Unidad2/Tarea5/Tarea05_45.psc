// Tarea05_45
// Boletín 2 - Ejercicio 23
//
// Enunciado: Pedir 5 números e indicar si alguno es múltiplo de 3.

Algoritmo Tarea05_45
  Definir i,n Como Entero
  Definir hay Como Logico
  hay <- Falso
  Para i <- 1 Hasta 5 Hacer
    Escribir "Introduzca el número ", i, ":"
    Leer n
    Si n MOD 3 = 0 Entonces
      hay <- Verdadero
    FinSi
  FinPara
  Si hay Entonces
    Escribir "Hay al menos un múltiplo de 3"
  Sino
    Escribir "Ningún número es múltiplo de 3"
  FinSi
FinAlgoritmo
