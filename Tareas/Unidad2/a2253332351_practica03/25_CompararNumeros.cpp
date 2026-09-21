#include <iostream>
using namespace std;

int main() {
    int numero1, numero2;

    cout << "Introduce el primer numero: ";
    cin >> numero1;
    cout << "Introduce el segundo numero: ";
    cin >> numero2;

    if (numero1 >= numero2) {
        if (numero1 == numero2) {
            cout << "Los numeros " << numero1 << " y " << numero2 << " son iguales" << endl;
        } else {
            cout << numero1 << " es el mayor de los dos" << endl;
        }
    } else {
        cout << numero2 << " es el mayor de los dos" << endl;
    }

    return 0;
}
