Algoritmo TRIANGULO_SUPERFICIE
    DEFINIR x1, x2, x3, y1, y2, y3, area Como REAL;
    ESCRIBIR "Introduce el valor de x1: "; LEER x1;
    ESCRIBIR "Introduce el valor de x2: "; LEER x2;
    ESCRIBIR "Introduce el valor de x3: "; LEER x3;
    ESCRIBIR "Introduce el valor de y1: "; LEER y1;
    ESCRIBIR "Introduce el valor de y2: "; LEER y2;
    ESCRIBIR "Introduce el valor de y3: "; LEER y3;
    area <- (((x1 * y2) + (x2 * y3) + (x3 * y1)) - ((x1 * y3) + (x3 * y2) + (x2 *
y1))) / 2;
    ESCRIBIR "El área del triángulo es: ";

    ESCRIBIR area;
FinAlgoritmo
