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

    string stars = "";

    for (int i = 0; i < count; ++i) {
        stars.push_back('*');
        cout << stars << '\n';
    }

    return 0;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
