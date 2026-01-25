#include <iostream>
#include <sstream>
#include <vector>
#include <climits>
#include <algorithm>

using namespace std;

void setup();

int main() {
    setup();

    vector<int> numbers(20);

    for (int i = 0; i < 20; ++i) {
        numbers[i] = i + 1;
    }

    vector<pair<int, int>> reversArea(10);
    for (int i = 0; i < 10; ++i) {
        cin >> reversArea[i].first >> reversArea[i].second;
    }

    for (auto& area : reversArea) {
        reverse(numbers.begin() + (area.first - 1), numbers.begin() + (area.second));
    }

    for (auto& number : numbers) {
        cout << number << ' ';
    }

    return 0;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
