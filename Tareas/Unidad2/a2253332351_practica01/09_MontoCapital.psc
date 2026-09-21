Algoritmo MONTO_CAPITAL
    DEFINIR capital, interes, monto Como REAL;
    capital <- 0; interes <- 0; monto <- 0;
    ESCRIBIR "Ingrese el capital: "; LEER capital;
    ESCRIBIR "Ingrese la tasa de interés: "; LEER interes;
    monto <- capital * (1 + (interes / 100));
    ESCRIBIR "El monto es: ";

    ESCRIBIR monto;
FinAlgoritmo
