#include <iostream>
using namespace std;

int main() {
    int c;
    double f;

    cout << "Introduce los grados Celsius: ";
    cin >> c;

    f = (9.0 / 5) * c + 32;

    cout << "Los grados Celsius " << c << " a grados Fahrenheit son " << f << endl;

    return 0;
}
