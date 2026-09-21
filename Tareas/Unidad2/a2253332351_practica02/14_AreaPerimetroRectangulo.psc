Algoritmo AREA_PERIMETRO_RECTANGULO
    DEFINIR base, altura, area, perimetro Como Real;
    ESCRIBIR "Ingrese la base del rectángulo: "; LEER base;
    ESCRIBIR "Ingrese la altura del rectángulo: "; LEER altura;
    area <- base * altura;
    perimetro <- 2 * (base + altura);
    ESCRIBIR "El área es: "; ESCRIBIR area;
    ESCRIBIR "El perímetro es: "; ESCRIBIR perimetro;
FinAlgoritmo
