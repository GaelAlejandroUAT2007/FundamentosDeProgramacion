// Tarea05_19
// Boletín 1 - Ejercicio 19
//
// Enunciado: Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo
// todos los meses de 30 días.

Algoritmo Tarea05_19
  Definir d1,m1,a1,d2,m2,a2,t1,t2,dif Como Entero
  Escribir "Fecha 1 - día:"
  Leer d1
  Escribir "Fecha 1 - mes:"
  Leer m1
  Escribir "Fecha 1 - año:"
  Leer a1
  Escribir "Fecha 2 - día:"
  Leer d2
  Escribir "Fecha 2 - mes:"
  Leer m2
  Escribir "Fecha 2 - año:"
  Leer a2
  t1 <- a1*360 + m1*30 + d1
  t2 <- a2*360 + m2*30 + d2
  Si t2 >= t1 Entonces
    dif <- t2 - t1
  Sino
    dif <- t1 - t2
  FinSi
  Escribir "Diferencia: ", dif, " días"
FinAlgoritmo
