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

    string stars(count , '*');

    for (int i = 0; i < count; ++i) {
        cout << stars << '\n';
        stars.pop_back();
    }

    return 0;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
