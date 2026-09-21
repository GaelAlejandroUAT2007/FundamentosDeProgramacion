Algoritmo AREAS_PRISMA
    DEFINIR perimetro, apotema, altura, aTotal, aLateral, aBase Como REAL;
    perimetro <- 0; apotema <- 0; altura <- 0; aTotal <- 0; aLateral <- 0; aBase <-
0;
    ESCRIBIR "Ingrese el perímetro de la base: "; LEER perimetro;
    ESCRIBIR "Ingrese la Apotema: "; LEER apotema;
    ESCRIBIR "Ingrese la Altura: "; LEER altura;
    aBase <- (perimetro * apotema) / 2;
    aLateral <- (perimetro * altura) / 2;
    aTotal <- (2 * aBase) + aLateral;
    ESCRIBIR "El área de la base es: "; ESCRIBIR aBase;
    ESCRIBIR "El área lateral es: "; ESCRIBIR aLateral;
    ESCRIBIR "El área total es: "; ESCRIBIR aTotal;
FinAlgoritmo
