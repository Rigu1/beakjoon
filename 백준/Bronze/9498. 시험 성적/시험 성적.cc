#include <iostream>
#include <vector>

using namespace std;

void setup();

int main() {
    setup();

    int grade;
    cin >> grade;

    switch (grade / 10) {
        case 10:
        case 9:
            cout << 'A';
            break;
        case 8:
            cout << 'B';
            break;
        case 7:
            cout << 'C';
            break;
        case 6:
            cout << 'D';
            break;
        default:
            cout << 'F';
    }

    return 0;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
