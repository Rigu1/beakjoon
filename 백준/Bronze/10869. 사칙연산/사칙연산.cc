#include <iostream>
#include <vector>

using namespace std;

void setup();

int main() {
    setup();

    int A, B;
    cin >> A >> B;

    cout << A + B << endl;
    cout << A - B << endl;
    cout << A * B << endl;
    cout << A / B << endl;
    cout << A % B;

    return 0;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
