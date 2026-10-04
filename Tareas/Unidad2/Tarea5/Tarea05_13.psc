// Tarea05_13
// Boletín 1 - Ejercicio 13
//
// Enunciado: Pedir un número entre 0 y 9.999 y decir si es capicúa.

Algoritmo Tarea05_13
  Definir n,u,d,c,m Como Entero
  Definir cap Como Logico
  Escribir "Introduce un número entre 0 y 9999:"
  Leer n
  Si n < 0 O n > 9999 Entonces
    Escribir "Número fuera de rango"
  Sino
    u <- n MOD 10
    d <- (trunc(n / 10)) MOD 10
    c <- (trunc(n / 100)) MOD 10
    m <- trunc(n / 1000)
    cap <- Falso
    Si n < 10 Entonces
      cap <- Verdadero
    Sino
      Si n < 100 Entonces
        cap <- (d = u)
      Sino
        Si n < 1000 Entonces
          cap <- (c = u)
        Sino
          cap <- (m = u Y c = d)
        FinSi
      FinSi
    FinSi
    Si cap Entonces
      Escribir "El número es capicúa"
    Sino
      Escribir "El número NO es capicúa"
    FinSi
  FinSi
FinAlgoritmo
