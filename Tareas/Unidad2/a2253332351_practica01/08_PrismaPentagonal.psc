Algoritmo PRISMA_PENTAGONAL
    DEFINIR aBase, perimetro, apotema, aLado, altura, aTotal, volumen Como Real;
    ESCRIBIR "Ingrese el perímetro de la base: "; LEER perimetro;
    ESCRIBIR "Ingrese el valor de la apotema: "; LEER apotema;
    ESCRIBIR "Ingrese el valor de la altura: "; LEER altura;
    aBase <- (perimetro * apotema) / 2;
    aLado <- perimetro * altura;
    aTotal <- (2 * aBase) + aLado;
    volumen <- aBase * altura;
    ESCRIBIR "El área de la base es: "; ESCRIBIR aBase;

    ESCRIBIR "El área lateral es: "; ESCRIBIR aLado;
    ESCRIBIR "El área total es: "; ESCRIBIR aTotal;
    ESCRIBIR "El volumen del prisma pentagonal es: "; ESCRIBIR volumen;
FinAlgoritmo
