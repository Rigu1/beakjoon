#include <iostream>
#include <sstream>
#include <vector>
#include <climits>
#include <algorithm>

using namespace std;

void setup();

int main() {
    setup();

    int count;
    cin >> count;

    string stars((count * 2) - 1, '*');

    for (int i = 0; i < count; ++i) {
        cout << stars << '\n';
        stars.pop_back();
        stars[i] = ' ';
    }

    return 0;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
