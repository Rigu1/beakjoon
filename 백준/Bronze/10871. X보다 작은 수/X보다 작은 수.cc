#include <iostream>
#include <vector>

using namespace std;

void setup();

int main() {
    setup();

    int N, X;
    cin >> N >> X;

    vector<int> nums(N);

    for (int i = 0; i < N; i++) {
        cin >> nums[i];
    }

    for (int i = 0; i < N; i++) {
        if (nums[i] < X) {
            cout << nums[i] << ' ';
        }
    }
    return 0;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
