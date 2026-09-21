Algoritmo PROPINA_RESTAURANTE
    DEFINIR consumo, porcentajePropina, propina, total Como Real;
    ESCRIBIR "Ingrese el consumo: "; LEER consumo;
    ESCRIBIR "Ingrese el porcentaje de propina: "; LEER porcentajePropina;
    propina <- consumo * (porcentajePropina / 100);
    total <- consumo + propina;
    ESCRIBIR "La propina es: "; ESCRIBIR propina;
    ESCRIBIR "El total a pagar es: "; ESCRIBIR total;
FinAlgoritmo
