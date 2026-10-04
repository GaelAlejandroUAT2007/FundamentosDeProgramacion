// Tarea05_12
// Boletín 1 - Ejercicio 12
//
// Enunciado: Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.

Algoritmo Tarea05_12
  Definir n,u,d,c,m Como Entero
  Escribir "Introduce un número entre 0 y 9999:"
  Leer n
  Si n < 0 O n > 9999 Entonces
    Escribir "Número fuera de rango"
  Sino
    u <- n MOD 10
    d <- (trunc(n / 10)) MOD 10
    c <- (trunc(n / 100)) MOD 10
    m <- trunc(n / 1000)
    Escribir "Con las cifras al revés: ", u, d, c, m
  FinSi
FinAlgoritmo
