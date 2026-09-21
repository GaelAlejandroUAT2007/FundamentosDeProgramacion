#include <iostream>
using namespace std;

int main() {
    int numero, residuo;

    cout << "Introduce un numero entero: ";
    cin >> numero;

    residuo = numero % 2;

    if (residuo == 0) {
        cout << numero << " es PAR" << endl;
    } else {
        cout << numero << " es IMPAR" << endl;
    }

    return 0;
}
