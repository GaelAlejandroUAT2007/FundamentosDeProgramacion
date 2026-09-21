#include <iostream>
using namespace std;

int main() {
    double base;
    double altura;
    double area;

    cout << "Introduce la base: ";
    cin >> base;
    cout << "Introduce la altura: ";
    cin >> altura;

    area = base * altura;

    cout << "El area es = " << area << endl;

    return 0;
}
