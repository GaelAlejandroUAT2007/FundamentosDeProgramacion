#include <iostream>
using namespace std;

int main() {
    double lMuro;
    double aMuro;
    double n;
    double pCastillo;
    double largoLadrillo;
    double altoLadrillo;
    double juntaH;
    double juntaV;
    double areaMuro;
    double areaCastillos;
    double areaNeta;
    double areaLadrilloJunta;
    double numLadrillos;

    cout << "Introduce la longitud del muro (X) en metros: ";
    cin >> lMuro;
    cout << "Introduce la altura del muro (Y) en metros: ";
    cin >> aMuro;
    cout << "Introduce el numero de castillos (N): ";
    cin >> n;
    cout << "Introduce la longitud de cada castillo (P) en metros: ";
    cin >> pCastillo;
    cout << "Introduce el largo del ladrillo en metros: ";
    cin >> largoLadrillo;
    cout << "Introduce la altura del ladrillo en metros: ";
    cin >> altoLadrillo;
    cout << "Introduce el espesor de la junta horizontal en metros: ";
    cin >> juntaH;
    cout << "Introduce el espesor de la junta vertical en metros: ";
    cin >> juntaV;

    areaMuro = lMuro * aMuro;
    areaCastillos = n * pCastillo * aMuro;
    areaNeta = areaMuro - areaCastillos;
    areaLadrilloJunta = (altoLadrillo + juntaH) * (largoLadrillo + juntaV);
    numLadrillos = areaNeta / areaLadrilloJunta;

    cout << "El area del muro es: " << areaMuro << " m2" << endl;
    cout << "El area ocupada por los castillos es: " << areaCastillos << " m2" << endl;
    cout << "El area neta a cubrir con ladrillo es: " << areaNeta << " m2" << endl;
    cout << "El numero de ladrillos necesarios es: " << numLadrillos << endl;

    return 0;
}
