Algoritmo HEXA_CUBO
    DEFINIR lado, aBase, aLado, aTotal, volumen Como REAL;
    ESCRIBIR "Ingrese el valor del lado del Hexaedro o Cubo: ";
    LEER lado;
    aBase <- lado * lado;
    aLado <- 4 * (lado * lado);
    aTotal <- 6 * (lado * lado);
    volumen <- lado * lado * lado;
    ESCRIBIR "El área de la base es: "; ESCRIBIR aBase;
    ESCRIBIR "El área lateral de la base es: "; ESCRIBIR aLado;
    ESCRIBIR "El área total de la base es: "; ESCRIBIR aTotal;
    ESCRIBIR "El volumen es: "; ESCRIBIR volumen;
FinAlgoritmo
