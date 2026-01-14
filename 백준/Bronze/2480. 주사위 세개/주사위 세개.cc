#include <iostream>
#include <algorithm>

using namespace std;

void setup();

int main() {
    setup();

    int first, second, third;
    cin >> first >> second >> third;

    if (first == second && second == third) {
        cout << 10'000 + first * 1'000;
    } else if (first == second || first == third) {
        cout << 1'000 + first * 100;
    } else if (second == third) {
        cout << 1'000 + second * 100;
    } else {
        cout << 100 * max({first, second, third});

    }

    return 0;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
