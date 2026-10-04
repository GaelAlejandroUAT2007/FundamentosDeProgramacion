// Tarea05_50
// Boletín 3 - Ejercicio 5
//
// Enunciado: Mostrar un contador de 5 dígitos (X-X-X-X-X) que vaya de 0-0-0-0-0 a 9-9-9-9-9,
// con la particularidad de que cada vez que aparezca un 3 se sustituya por una E.

Algoritmo Tarea05_50
  Definir a,b,c,d,e Como Entero
  Definir ta,tb,tc,td,te Como Cadena
  Para a <- 0 Hasta 9 Hacer
    Si a = 3 Entonces
      ta <- "E"
    Sino
      ta <- ConvertirATexto(a)
    FinSi
    Para b <- 0 Hasta 9 Hacer
      Si b = 3 Entonces
        tb <- "E"
      Sino
        tb <- ConvertirATexto(b)
      FinSi
      Para c <- 0 Hasta 9 Hacer
        Si c = 3 Entonces
          tc <- "E"
        Sino
          tc <- ConvertirATexto(c)
        FinSi
        Para d <- 0 Hasta 9 Hacer
          Si d = 3 Entonces
            td <- "E"
          Sino
            td <- ConvertirATexto(d)
          FinSi
          Para e <- 0 Hasta 9 Hacer
            Si e = 3 Entonces
              te <- "E"
            Sino
              te <- ConvertirATexto(e)
            FinSi
            Escribir ta, "-", tb, "-", tc, "-", td, "-", te
          FinPara
        FinPara
      FinPara
    FinPara
  FinPara
FinAlgoritmo
