Algoritmo CONVERSION_DOLAR_PESO
    DEFINIR dolares, tipoCambio, pesos Como Real;
    ESCRIBIR "Ingrese la cantidad en dólares: "; LEER dolares;
    ESCRIBIR "Ingrese el tipo de cambio: "; LEER tipoCambio;
    pesos <- dolares * tipoCambio;
    ESCRIBIR "La cantidad equivalente en pesos es: ";
    ESCRIBIR pesos;
FinAlgoritmo
