// Tarea05_40
// Boletín 2 - Ejercicio 18
//
// Enunciado: Igual que el anterior pero suponiendo que no se introduce el precio por litro.
// Solo existen tres productos: 1 → 0,6 €/litro, 2 → 3 €/litro y 3 → 1,25 €/litro.

Algoritmo Tarea05_40
  Definir i,cod,c600 Como Entero
  Definir lit,pre,imp,total,litros1 Como Real
  total <- 0
  litros1 <- 0
  c600 <- 0
  Para i <- 1 Hasta 5 Hacer
    Repetir
      Escribir "Factura ", i, " - código del artículo (1, 2 o 3):"
      Leer cod
      Si cod < 1 O cod > 3 Entonces
        Escribir "Código no válido"
      FinSi
    Hasta Que cod >= 1 Y cod <= 3
    Escribir "Factura ", i, " - litros vendidos:"
    Leer lit
    Segun cod Hacer
      1:
        pre <- 0.6
      2:
        pre <- 3
      3:
        pre <- 1.25
    FinSegun
    imp <- lit * pre
    total <- total + imp
    Si cod = 1 Entonces
      litros1 <- litros1 + lit
    FinSi
    Si imp > 600 Entonces
      c600 <- c600 + 1
    FinSi
  FinPara
  Escribir "Facturación total: ", total
  Escribir "Litros del artículo 1: ", litros1
  Escribir "Facturas de más de 600 €: ", c600
FinAlgoritmo
