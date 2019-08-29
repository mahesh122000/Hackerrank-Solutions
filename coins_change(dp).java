import java.io.*;
import java.math.*;
import java.util.*;



public class Solution {

    public static long ans(int[] a,int n,int k)
    {long b[]=new long[n+1];
    for(int i=1;i<=n;i++)
    b[i]=0;
    b[0]=1;
    for(int i=0;i<k;i++)
    {for(int j=a[i];j<=n;j++)
    {b[j]+=b[j-a[i]];}}
    return b[n];}


    public static void main(String[] args) 
        {Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int a[]=new int[m];
        for(int i=0;i<m;i++)
        a[i]=s.nextInt();
        System.out.println(ans(a,n,m));}
}
        
