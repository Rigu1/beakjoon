#include <iostream>
#include <sstream>
#include <vector>
#include <climits>
#include <algorithm>

using namespace std;

void setup();

int main() {
    setup();

    vector<int> numbers(9);
    for (int i = 0; i < 9; ++i) {
        cin >> numbers[i];
    }

    int index = 0;
    int max = 0;
    for (int i = 0; i < 9; ++i) {
        if (max < numbers[i]) {
            max = numbers[i];
            index = i + 1;
        }
    }

    cout << max << '\n' << index;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
