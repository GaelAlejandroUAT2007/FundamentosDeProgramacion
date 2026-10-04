// Tarea05_35
// Boletín 2 - Ejercicio 13
//
// Enunciado: Pedir 10 números. Mostrar la media de los números positivos, la media de los
// números negativos y la cantidad de ceros.

Algoritmo Tarea05_35
  Definir i,cp,cn,cz Como Entero
  Definir n,sp,sn Como Real
  sp <- 0
  sn <- 0
  cp <- 0
  cn <- 0
  cz <- 0
  Para i <- 1 Hasta 10 Hacer
    Escribir "Introduzca el número ", i, ":"
    Leer n
    Si n > 0 Entonces
      sp <- sp + n
      cp <- cp + 1
    Sino
      Si n < 0 Entonces
        sn <- sn + n
        cn <- cn + 1
      Sino
        cz <- cz + 1
      FinSi
    FinSi
  FinPara
  Si cp > 0 Entonces
    Escribir "Media de positivos: ", sp / cp
  Sino
    Escribir "No hay números positivos"
  FinSi
  Si cn > 0 Entonces
    Escribir "Media de negativos: ", sn / cn
  Sino
    Escribir "No hay números negativos"
  FinSi
  Escribir "Cantidad de ceros: ", cz
FinAlgoritmo
