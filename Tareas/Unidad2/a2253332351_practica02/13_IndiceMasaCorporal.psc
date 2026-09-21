Algoritmo INDICE_MASA_CORPORAL
    DEFINIR peso, estatura, imc Como Real;
    ESCRIBIR "Ingrese el peso en kilogramos: ";
    LEER peso;
    ESCRIBIR "Ingrese la estatura en metros: ";
    LEER estatura;
    imc <- peso / (estatura * estatura);
    ESCRIBIR "El índice de masa corporal es: ";
    ESCRIBIR imc;
FinAlgoritmo
