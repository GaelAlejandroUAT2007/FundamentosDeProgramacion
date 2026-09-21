#include <iostream>
using namespace std;

int main() {
    int numero1, numero2, numero3, resultado;

    cout << "Introduce el primer numero: ";
    cin >> numero1;
    cout << "Introduce el segundo numero: ";
    cin >> numero2;
    cout << "Introduce el tercer numero: ";
    cin >> numero3;

    if (numero1 < 0) {
        resultado = numero1 + numero2 + numero3;
    } else {
        resultado = numero1 * numero2 * numero3;
    }

    cout << "El resultado es: " << resultado << endl;

    return 0;
}
