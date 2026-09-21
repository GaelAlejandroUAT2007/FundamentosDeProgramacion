Algoritmo VolumenCilindro
    Definir radio, altura, PI, aBase, aLateral, aTotal, volumen Como Real

    PI <- 3.14159265358979323846
    Escribir "Ingrese el radio del cilindro: "
    Leer radio
    Escribir "Ingrese la altura del cilindro: "
    Leer altura

    aBase <- PI * (radio * radio)
    aLateral <- 2 * PI * radio * altura
    aTotal <- aLateral + (2 * aBase)
    volumen <- aBase * altura

    Escribir "El área de la base es: ", aBase
    Escribir "El área lateral es: ", aLateral
    Escribir "El área total es: ", aTotal
    Escribir "El volumen del cilindro es: ", volumen
FinAlgoritmo
