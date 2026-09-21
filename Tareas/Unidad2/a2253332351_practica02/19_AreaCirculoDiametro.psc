Algoritmo AREA_CIRCULO_DIAMETRO
    DEFINIR diametro, radio, area, circunferencia Como Real;
    ESCRIBIR "Ingrese el diámetro del círculo: "; LEER diametro;
    radio <- diametro / 2;
    area <- PI * (radio * radio);
    circunferencia <- 2 * PI * radio;
    ESCRIBIR "El radio es: "; ESCRIBIR radio;
    ESCRIBIR "El área es: "; ESCRIBIR area;
    ESCRIBIR "La circunferencia es: "; ESCRIBIR circunferencia;
FinAlgoritmo
