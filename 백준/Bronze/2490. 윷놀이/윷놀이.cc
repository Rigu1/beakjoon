#include <iostream>
#include <sstream>
#include <vector>
#include <algorithm>

using namespace std;

void setup();

string getLine();

vector<string> getLines();

int main() {
    setup();

    vector<string> lines = getLines();

    for (auto &line: lines) {
        stringstream ss(line);
        vector<int> tokens(4);

        for (int i = 0; i < 4; i++) {
            ss >> tokens[i];
        }

        switch (int result = count(tokens.begin(), tokens.end(), 1)) {
            case 3:
                cout << 'A';
                break;
            case 2:
                cout << 'B';
                break;
            case 1:
                cout << 'C';
                break;
            case 0:
                cout << 'D';
                break;
            default:
                cout << 'E';
        }
        cout << endl;
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
