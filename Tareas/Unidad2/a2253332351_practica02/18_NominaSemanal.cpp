#include <iostream>
using namespace std;

int main() {
    double sueldoPorHora;
    double horasTrabajadas;
    double pagoTotal;

    cout << "Ingrese el sueldo por hora: ";
    cin >> sueldoPorHora;
    cout << "Ingrese las horas trabajadas: ";
    cin >> horasTrabajadas;

    pagoTotal = sueldoPorHora * horasTrabajadas;

    cout << "El pago total de la semana es: " << pagoTotal << endl;

    return 0;
}
