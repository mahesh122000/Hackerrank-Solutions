#include <iostream>
using namespace std;



int main() {
    long int n;
    cin >> n;
    string s[n];
    
    for(long int i = 0; i < n/2; i++){
        int k;
        cin >> k;
        string c;
        cin >> c;
        s[k]+= "- ";  
    }
    for(long int i = n/2; i < n; i++){
        int k;
        cin >> k;
        string c;
        cin >> c;
        s[k] =s[k]+c+" ";    
    }
    for(int i = 0; i < n; i++)
        cout << s[i];
    return 0;
}

