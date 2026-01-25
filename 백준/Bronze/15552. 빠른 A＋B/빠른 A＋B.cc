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

    for (int i = 0; i < count; ++i) {
        int a, b;
        cin >> a >> b;

        cout << a + b << '\n';
    }

    return 0;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
