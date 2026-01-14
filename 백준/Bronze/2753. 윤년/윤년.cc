#include <iostream>

using namespace std;

void setup();

int checkLeap(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
}

int main() {
    setup();

    int year;
    cin >> year;

    cout << checkLeap(year);

    return 0;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
