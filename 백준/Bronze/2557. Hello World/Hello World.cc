#include <iostream>
#include <vector>

using namespace std;

void setup();

int main() {
    setup();

    cout << "Hello World!";

    return 0;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
