#include <iostream>
#include <cmath>
using namespace std;

int main() {
    double x1;
    double y1;
    double x2;
    double y2;
    double x3;
    double y3;
    double distancia1;
    double distancia2;
    double distancia3;
    double perimetro;

    cout << "Ingresa la coordenada de x1: ";
    cin >> x1;
    cout << "Ingresa la coordenada de y1: ";
    cin >> y1;
    cout << "Ingresa la coordenada de x2: ";
    cin >> x2;
    cout << "Ingresa la coordenada de y2: ";
    cin >> y2;
    cout << "Ingresa la coordenada de x3: ";
    cin >> x3;
    cout << "Ingresa la coordenada de y3: ";
    cin >> y3;

    distancia1 = sqrt(pow((x1 - x2), 2) + pow((y1 - y2), 2));
    distancia2 = sqrt(pow((x2 - x3), 2) + pow((y2 - y3), 2));
    distancia3 = sqrt(pow((x3 - x1), 2) + pow((y3 - y1), 2));
    perimetro = distancia1 + distancia2 + distancia3;

    cout << "El perímetro del triángulo es: " << perimetro << endl;

    return 0;
}
