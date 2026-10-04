// Tarea05_46
// Boletín 3 - Ejercicio 1
//
// Enunciado: Realiza detenidamente una traza al siguiente programa y muestra cuál sería la
// salida por pantalla:  PARA i ← 1 HASTA 4 { PARA j ← 3 HASTA 0 INC −1 { suma ← i·10 + j;
// escribir(suma) } }

Algoritmo Tarea05_46
  Definir suma,i,j Como Entero
  Para i <- 1 Hasta 4 Hacer
    Para j <- 3 Hasta 0 Con Paso -1 Hacer
      suma <- i*10 + j
      Escribir suma
    FinPara
  FinPara
FinAlgoritmo
