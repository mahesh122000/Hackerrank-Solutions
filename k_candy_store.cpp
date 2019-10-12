#include<bits/stdc++.h>
using namespace std;
#define ku 1000000000
long long a[1001][1001]={0};
void initialise(int n,int r)
{
    int i,j;
    
    a[0][0]=1;
    for(i=1;i<1001;i++){
        a[i][0]=1;
        for(j=1;j<i+1;j++)
            a[i][j]=((a[i-1][j])%ku+(a[i-1][j-1])%ku)%ku;
    }
    cout<<a[n][r]<<"\n";
        
}
    int main()
{
    int t,n,k,p,l;
    cin>>t;
    while(t--)
    {
      cin>>n>>k;
      p=n+k-1;
      l=n-1;
      initialise(p,l);
    }

}