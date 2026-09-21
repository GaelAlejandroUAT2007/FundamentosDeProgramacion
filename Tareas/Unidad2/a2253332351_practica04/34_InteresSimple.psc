Algoritmo InteresSimple
    Definir capital, tasa, tiempo, interes, monto Como Real

    Escribir "Ingrese el capital inicial: "
    Leer capital
    Escribir "Ingrese la tasa de interés anual (%): "
    Leer tasa
    Escribir "Ingrese el tiempo en años: "
    Leer tiempo

    interes <- (capital * tasa * tiempo) / 100
    monto <- capital + interes

    Escribir "El interés generado es: ", interes
    Escribir "El monto final es: ", monto
FinAlgoritmo
