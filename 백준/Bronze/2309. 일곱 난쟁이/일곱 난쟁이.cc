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
    for (int i = 0; i < 9; i++) {
        cin >> numbers[i];
    }
    
    sort(numbers.begin(), numbers.end());
    
    int sum = 0;
    
    for (const auto& number : numbers) {
        sum += number;
    }

    int target = sum - 100;
    pair<int, int> fake;
    
    for (int i = 0; i < 8; i++) {
        for (int j = i + 1; j < 9; j++) {
            if (numbers[i] + numbers[j] == target) {
                fake.first = numbers[i];
                fake.second = numbers[j];
            }
        }
    }

    for (int i = 0; i < 9; i++) {
        if (numbers[i] == fake.first || numbers[i] == fake.second) {
            continue;
        }
        cout << numbers[i] << '\n';
    }
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
