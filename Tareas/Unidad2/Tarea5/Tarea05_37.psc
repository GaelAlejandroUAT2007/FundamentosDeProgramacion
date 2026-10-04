// Tarea05_37
// Boletín 2 - Ejercicio 15
//
// Enunciado: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
// la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.

Algoritmo Tarea05_37
  Definir i,edad,c18,c175 Como Entero
  Definir est,se,sh Como Real
  se <- 0
  sh <- 0
  c18 <- 0
  c175 <- 0
  Para i <- 1 Hasta 5 Hacer
    Escribir "Alumno ", i, " - edad:"
    Leer edad
    Escribir "Alumno ", i, " - estatura (m):"
    Leer est
    se <- se + edad
    sh <- sh + est
    Si edad > 18 Entonces
      c18 <- c18 + 1
    FinSi
    Si est > 1.75 Entonces
      c175 <- c175 + 1
    FinSi
  FinPara
  Escribir "Edad media: ", se / 5
  Escribir "Estatura media: ", sh / 5
  Escribir "Mayores de 18 años: ", c18
  Escribir "Miden más de 1.75: ", c175
FinAlgoritmo
