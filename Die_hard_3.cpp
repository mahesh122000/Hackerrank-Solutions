#include <bits/stdc++.h>

using namespace std;

  int gcd(int a, int b) 
{ 
    if (b == 0) 
        return a; 
    return gcd(b, a % b);  
      
}

    int main() 
    {
       
        int t;
        cin>>t;
        while(t--)
        {
        int a;
        int b;
        int c;
        cin>>a>>b>>c;
        int k=0;
        if(a>b)
        {k=a;
        a=b;
        b=k;}
        k=gcd(a,b);
        if(c%k==0 && c<=b)
        {cout<<"YES"<<endl;}
        else
        {cout<<"NO"<<endl;}}
    return 0;}
