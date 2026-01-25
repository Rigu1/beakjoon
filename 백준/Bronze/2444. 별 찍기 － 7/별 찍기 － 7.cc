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

    string stars(count - 1, ' ');


    for (int i = count - 1; i >= 0; --i) {
        stars.push_back('*');
        stars[i] = '*';
        cout << stars << '\n';
    }

    for (int i = 0; i < count - 1; i++) {
        stars.pop_back();
        stars[i] = ' ';
        cout << stars << '\n';
    }

    return 0;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
