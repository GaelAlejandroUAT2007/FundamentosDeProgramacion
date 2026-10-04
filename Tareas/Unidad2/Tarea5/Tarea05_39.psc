// Tarea05_39
// Boletín 2 - Ejercicio 17
//
// Enunciado: Una empresa de venta de desinfectantes necesita gestionar facturas. En cada
// factura figura: código del artículo, cantidad vendida en litros y precio por litro. De 5
// facturas, mostrar: facturación total, litros vendidos del artículo 1 y cuántas facturas
// fueron de más de 600 €.

Algoritmo Tarea05_39
  Definir i,cod,c600 Como Entero
  Definir lit,pre,imp,total,litros1 Como Real
  total <- 0
  litros1 <- 0
  c600 <- 0
  Para i <- 1 Hasta 5 Hacer
    Escribir "Factura ", i, " - código del artículo:"
    Leer cod
    Escribir "Factura ", i, " - litros vendidos:"
    Leer lit
    Escribir "Factura ", i, " - precio por litro:"
    Leer pre
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
