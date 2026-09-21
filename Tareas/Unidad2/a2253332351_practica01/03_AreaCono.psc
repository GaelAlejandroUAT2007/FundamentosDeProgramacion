Algoritmo AREA_CONO
    DEFINIR radio, generatriz, altura, aBase, aLado, aTotal, volumen Como REAL;
    radio <- 0;
    generatriz <- 0;
    altura <- 0;
    aBase <- 0;
    aLado <- 0;
    aTotal <- 0;
    volumen <- 0;
    ESCRIBIR "Ingrese el radio del cono: ";
    LEER radio;
    ESCRIBIR "Ingrese la generatriz del cono: ";
    LEER generatriz;
    ESCRIBIR "Ingrese la altura del cono: ";
    LEER altura;
    aBase <- PI * (radio * radio);
    aLado <- PI * radio * generatriz;
    aTotal <- aBase + aLado;
    volumen <- (1 / 3) * aBase * altura;
    ESCRIBIR "El área de la base es: "; ESCRIBIR aBase;
    ESCRIBIR "El área lateral es: "; ESCRIBIR aLado;
    ESCRIBIR "El área total es: "; ESCRIBIR aTotal;
    ESCRIBIR "El volumen es: "; ESCRIBIR volumen;
FinAlgoritmo
