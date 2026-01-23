#include <iostream>
#include <sstream>
#include <vector>
#include <climits>
#include <algorithm>

using namespace std;

void setup();

string getLine();

vector<string> getLines();

int main() {
    setup();

    vector<string> numbersText = getLines();
    vector<int> numbers;

    numbers.reserve(numbersText.size());
    for (auto &number: numbersText) {
        numbers.push_back(stoi(number));
    }

    int sum = 0;
    int min = INT_MAX;

    for (const auto &number: numbers) {
        if (number % 2 == 1) {
            if (min > number) {
                min = number;
            }
            sum += number;
        }
    }

    if (sum == 0) {
        cout << -1;
    } else {
        cout << sum << '\n' << min;
    }

    return 0;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}

string getLine() {
    string line;
    getline(cin, line);
    return line;
}

vector<string> getLines() {
    vector<string> lines;
    string line;
    while (getline(cin, line)) {
        if (line.empty()) {
            break;
        }
        lines.push_back(line);
    }
    return lines;
}
