#include <iostream>
using namespace std;

int main() {
    double x1;
    double y1;
    double x2;
    double y2;
    double x3;
    double y3;
    double area;

    cout << "Ingresa la cordenada de x1: ";
    cin >> x1;
    cout << "Ingresa la cordenada de y1: ";
    cin >> y1;
    cout << "Ingresa la cordenada de x2: ";
    cin >> x2;
    cout << "Ingresa la cordenada de y2: ";
    cin >> y2;
    cout << "Ingresa la cordenada de x3: ";
    cin >> x3;
    cout << "Ingresa la cordenada de y3: ";
    cin >> y3;

    area = (((x1 * y2) + (x2 * y3) + (x3 * y1)) - ((x1 * y3) + (x3 * y2) + (x2 * y1))) / 2;

    cout << "El área del triángulo es: " << area << endl;

    return 0;
}
