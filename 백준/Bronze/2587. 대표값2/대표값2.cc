#include <iostream>
#include <sstream>
#include <vector>
#include <climits>
#include <algorithm>

using namespace std;

void setup();

int main() {
    setup();

    vector<int> numbers(5);
    for (int i = 0; i < 5; i++) {
        cin >> numbers[i];
    }

    long long sum = 0;
    for (const auto& number : numbers) {
        sum += number;
    }
    
    sort(numbers.begin(), numbers.end());

    cout << sum / 5 << '\n' << numbers[2];
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
