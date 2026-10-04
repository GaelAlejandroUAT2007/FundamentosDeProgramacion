// Tarea05_27
// Boletín 2 - Ejercicio 5
//
// Enunciado: Realizar un juego para adivinar un número. Pedir un número N y luego ir
// pidiendo números indicando «mayor» o «menor» según sea mayor o menor con respecto a N. El
// proceso termina cuando el usuario acierta.

Algoritmo Tarea05_27
  Definir n,x,intentos Como Entero
  intentos <- 0
  Escribir "Jugador 1, introduzca el número a adivinar:"
  Leer n
  Repetir
    Escribir "Jugador 2, introduzca un número:"
    Leer x
    intentos <- intentos + 1
    Si x > n Entonces
      Escribir "Mayor"
    Sino
      Si x < n Entonces
        Escribir "Menor"
      FinSi
    FinSi
  Hasta Que x = n
  Escribir "¡Acertó! Número de intentos: ", intentos
FinAlgoritmo
