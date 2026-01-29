#include <iostream>
#include <sstream>
#include <vector>

using namespace std;

void setup();

int main() {
    setup();

    vector<int> numbers(26);

    string line;
    cin >> line;

    for (auto& c : line) {
        numbers[c - 'a']++;
    }

    for (auto& number : numbers) {
        cout << number << ' ';
    }
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
