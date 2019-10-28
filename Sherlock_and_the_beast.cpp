#include <bits/stdc++.h>

using namespace std;


int main()
{
    int t;
    cin>>t;
    while(t--)
    {long n;
     cin>>n;
    if(n/3==0 && n/5==0)
     cout<<"-1"<<endl;
    else
    {int n3=n/3;
    int m3=n%3;
     int n5=0,m5=0;
    if(m3==0)
     n5=0;
    else if(m3==1)
    {if(n3>=3)
    {n3-=3;n5=2;}
    else
    {n5=-1;}}
    else if(m3==2)
    {if(n3>=1)
    {n3--;
     n5=1;
    }
    else 
     n5=-1;}
     if(n5==-1)
         cout<<"-1"<<endl;
     else
     {for(int i=0;i<n3*3;i++)
         cout<<"5";
         for(int i=0;i<n5*5;i++)
      cout<<"3";
     cout<<endl;}}}

    return 0;
}

