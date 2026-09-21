#include <iostream>
using namespace std;

int main() {
    double baseMayor;
    double baseMenor;
    double altura;
    double area;

    cout << "Ingrese la base mayor del trapecio: ";
    cin >> baseMayor;
    cout << "Ingrese la base menor del trapecio: ";
    cin >> baseMenor;
    cout << "Ingrese la altura del trapecio: ";
    cin >> altura;

    area = ((baseMayor + baseMenor) * altura) / 2;

    cout << "El área del trapecio es: " << area << endl;

    return 0;
}
