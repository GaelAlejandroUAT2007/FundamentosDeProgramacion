Algoritmo Ganancia_inversion
    DEFINIR interes Como Real;
    DEFINIR dias, capital, ganancia Como Entero;
    interes <- 0.02;
    dias <- 0;
    capital <- 0;
    ganancia <- 0;
    ESCRIBIR "Ingrese el monto a invertir: ";
    LEER capital;
    ESCRIBIR "Ingrese el número total de días del mes a considerar: ";
    LEER dias;

    ganancia <- (capital * dias) * interes;
    ESCRIBIR "La ganancia por cobrar después del mes es de: ";
    ESCRIBIR ganancia;
FinAlgoritmo
