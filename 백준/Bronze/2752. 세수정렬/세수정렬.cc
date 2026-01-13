#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void setup();

int main() {
    setup();

    vector<int> arr(3);
    cin >> arr[0] >> arr[1] >> arr[2];

    sort(arr.begin(), arr.end());

    cout << arr[0] << " " << arr[1] << " " << arr[2];

    return 0;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
