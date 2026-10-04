// Tarea05_08
// Boletín 1 - Ejercicio 8
//
// Enunciado: Pedir dos números y decir cuál es el mayor o si son iguales.

Algoritmo Tarea05_08
  Definir n1,n2 Como Entero
  Escribir "Introduce un número:"
  Leer n1
  Escribir "Introduce otro número:"
  Leer n2
  Si n1 = n2 Entonces
    Escribir "Los números son iguales"
  Sino
    Si n1 > n2 Entonces
      Escribir n1, " es mayor que ", n2
    Sino
      Escribir n2, " es mayor que ", n1
    FinSi
  FinSi
FinAlgoritmo
