// Tarea05_06
// Boletín 1 - Ejercicio 6
//
// Enunciado: Pedir dos números y decir si uno es múltiplo del otro.

Algoritmo Tarea05_06
  Definir n1,n2 Como Entero
  Escribir "Introduce un número:"
  Leer n1
  Escribir "Introduce otro número:"
  Leer n2
  Si (n2 <> 0 Y n1 MOD n2 = 0) O (n1 <> 0 Y n2 MOD n1 = 0) Entonces
    Escribir "Son múltiplos"
  Sino
    Escribir "No son múltiplos"
  FinSi
FinAlgoritmo
