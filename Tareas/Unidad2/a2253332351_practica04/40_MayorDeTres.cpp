#include <iostream>
using namespace std;

int main() {
    double n1, n2, n3, mayor;

    cout << "Introduce el primer numero: ";
    cin >> n1;
    cout << "Introduce el segundo numero: ";
    cin >> n2;
    cout << "Introduce el tercer numero: ";
    cin >> n3;

    if (n1 >= n2 && n1 >= n3) {
        mayor = n1;
    } else if (n2 >= n1 && n2 >= n3) {
        mayor = n2;
    } else {
        mayor = n3;
    }

    cout << "El numero mayor es: " << mayor << endl;

    return 0;
}
