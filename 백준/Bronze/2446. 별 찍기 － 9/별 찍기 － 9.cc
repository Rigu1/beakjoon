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

    string stars(count * 2 - 1 , '*');

    for (int i = 0; i < count - 1; ++i) {
        cout << stars << '\n';
        stars[i] = ' ';
        stars.pop_back();
    }

    stars.pop_back();

    for (int i = 0; i < count; ++i) {
        stars.push_back('*');
        stars[(count - 1)- i] = '*';
        cout << stars << '\n';
    }

    return 0;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
