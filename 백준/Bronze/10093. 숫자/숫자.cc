#include <iostream>
#include <sstream>
#include <vector>
#include <climits>
#include <algorithm>

using namespace std;

void setup();

int main() {
    setup();

    vector<long long> numPair(2);
    for (int i = 0; i < 2; i++) {
        cin >> numPair[i];
    }

    sort(numPair.begin(), numPair.end());

    cout << max(0LL, numPair[1] - numPair[0] - 1) << '\n';
    for (long long i = numPair[0] + 1; i < numPair[1]; i++) {
        cout << i << " ";
    }

    return 0;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
