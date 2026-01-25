#include <iostream>
#include <sstream>
#include <vector>
#include <climits>
#include <algorithm>

using namespace std;

void setup();

int calculateCharges(pair<int, int>& cycleOfMoney, vector<int>& times) {
    int cycleCount = 0;
    for (auto& time : times) {
        cycleCount += (time + (cycleOfMoney.first)) / (cycleOfMoney.first);
    }

    return cycleCount * cycleOfMoney.second;;
}

int main() {
    setup();

    pair<int, int> cycleOfYeon = make_pair<int, int>(30, 10);
    pair<int, int> cycleOfMinsik = make_pair<int, int>(60, 15);

    int count = 0;
    cin >> count;

    vector<int> times(count);
    for (int i = 0; i < count; ++i) {
        cin >> times[i];
    }

    int chargesOfYeon = calculateCharges(cycleOfYeon, times);
    int chargesOfMinsik = calculateCharges(cycleOfMinsik, times);

    if (chargesOfYeon > chargesOfMinsik) {
        cout << "M " << chargesOfMinsik;
    } else if (chargesOfYeon < chargesOfMinsik) {
        cout << "Y " << chargesOfYeon;
    } else {
        cout << "Y M " << chargesOfYeon;
    }

    return 0;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
