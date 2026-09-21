Algoritmo TRIANGULO
    DEFINIR x1, x2, x3, y1, y2, y3, distancia1, distancia2, distancia3, perimetro
Como REAL;
    ESCRIBIR "Introduce el valor de x1: "; LEER x1;
    ESCRIBIR "Introduce el valor de x2: "; LEER x2;
    ESCRIBIR "Introduce el valor de x3: "; LEER x3;
    ESCRIBIR "Introduce el valor de y1: "; LEER y1;
    ESCRIBIR "Introduce el valor de y2: "; LEER y2;
    ESCRIBIR "Introduce el valor de y3: "; LEER y3;
    distancia1 <- RAIZ((x1-x2)^2 + (y1-y2)^2);
    distancia2 <- RAIZ((x2-x3)^2 + (y2-y3)^2);
    distancia3 <- RAIZ((x3-x1)^2 + (y3-y1)^2);
    perimetro <- distancia1 + distancia2 + distancia3;
    ESCRIBIR "El perímetro del triángulo es: ";
    ESCRIBIR perimetro;
FinAlgoritmo
