#include <iostream>
#include <vector>

using namespace std;

void setup();

int main() {
    setup();

    const string cat =
        "\\    /\\\n "
        ")  ( ')\n"
        "(  /  )\n"
        " \\(__)|";

    cout << cat;

    return 0;
}

void setup() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
}
