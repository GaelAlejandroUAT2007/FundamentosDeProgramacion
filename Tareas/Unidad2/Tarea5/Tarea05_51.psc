// Tarea05_51
// Boletín 3 - Ejercicio 6
//
// Enunciado: Realizar un programa que nos pida un número n, y nos diga cuántos números hay
// entre 1 y n que son primos.

Algoritmo Tarea05_51
  Definir n,i,j,cont Como Entero
  Definir esPrimo Como Logico
  Escribir "Introduzca un número n:"
  Leer n
  cont <- 0
  Para i <- 2 Hasta n Hacer
    esPrimo <- Verdadero
    j <- 2
    Mientras j * j <= i Y esPrimo Hacer
      Si i MOD j = 0 Entonces
        esPrimo <- Falso
      FinSi
      j <- j + 1
    FinMientras
    Si esPrimo Entonces
      cont <- cont + 1
    FinSi
  FinPara
  Escribir "Entre 1 y ", n, " hay ", cont, " números primos"
FinAlgoritmo
