// Tarea05_22
// Boletín 1 - Ejercicio 22
//
// Enunciado: Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar:
// cincuenta y seis.

Algoritmo Tarea05_22
  Definir n,d,u Como Entero
  Definir ds,us Como Cadena
  Escribir "Introduce un número de 0 a 99:"
  Leer n
  Si n < 0 O n > 99 Entonces
    Escribir "Número fuera de rango (0 a 99)"
  Sino
    d <- trunc(n / 10)
    u <- n MOD 10
    Si n < 30 Entonces
      Segun n Hacer
        0:
          Escribir "cero"
        1:
          Escribir "uno"
        2:
          Escribir "dos"
        3:
          Escribir "tres"
        4:
          Escribir "cuatro"
        5:
          Escribir "cinco"
        6:
          Escribir "seis"
        7:
          Escribir "siete"
        8:
          Escribir "ocho"
        9:
          Escribir "nueve"
        10:
          Escribir "diez"
        11:
          Escribir "once"
        12:
          Escribir "doce"
        13:
          Escribir "trece"
        14:
          Escribir "catorce"
        15:
          Escribir "quince"
        16:
          Escribir "dieciséis"
        17:
          Escribir "diecisiete"
        18:
          Escribir "dieciocho"
        19:
          Escribir "diecinueve"
        20:
          Escribir "veinte"
        21:
          Escribir "veintiuno"
        22:
          Escribir "veintidós"
        23:
          Escribir "veintitrés"
        24:
          Escribir "veinticuatro"
        25:
          Escribir "veinticinco"
        26:
          Escribir "veintiséis"
        27:
          Escribir "veintisiete"
        28:
          Escribir "veintiocho"
        29:
          Escribir "veintinueve"
      FinSegun
    Sino
      Segun d Hacer
        3:
          ds <- "treinta"
        4:
          ds <- "cuarenta"
        5:
          ds <- "cincuenta"
        6:
          ds <- "sesenta"
        7:
          ds <- "setenta"
        8:
          ds <- "ochenta"
        9:
          ds <- "noventa"
      FinSegun
      Si u = 0 Entonces
        Escribir ds
      Sino
        Segun u Hacer
          1:
            us <- "uno"
          2:
            us <- "dos"
          3:
            us <- "tres"
          4:
            us <- "cuatro"
          5:
            us <- "cinco"
          6:
            us <- "seis"
          7:
            us <- "siete"
          8:
            us <- "ocho"
          9:
            us <- "nueve"
        FinSegun
        Escribir ds, " y ", us
      FinSi
    FinSi
  FinSi
FinAlgoritmo
