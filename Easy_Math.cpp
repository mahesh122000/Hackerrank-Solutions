#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;

    while(t--) {
        int n;
        cin >> n;

        vector<int> visited(n + 1, 0);
        vector<int> value(n + 1, 0);

        int a = 0;
        int b = 0;
        int i = 0;
        while(i || a == 0) {
            a++;
            i = (i * 10 + 4) % n;
            if(visited[i] == 1) {
                b  = value[i];
                a -= value[i];
                break;
            }
            else {
                visited[i] = 1;
                value[i] = a;
            }
        }
        cout << 2 * a + b << '\n';
    }
    return 0;
}