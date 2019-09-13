import java.io.*;
import java.math.*;
import java.util.*;


public class Solution {

     static long moduloMultiplication(long a, 
                            long b, long mod) 
    {    long res = 0;   
        a %= mod; 
        while (b > 0)  
        { if ((b & 1) > 0)  
            {res = (res + a) % mod;}  
            a = (2 * a) % mod;
            b >>= 1; 
        } 
        return res; 
    }

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    int x=s.nextInt();
    long a[][]=new long[n][2];
    for(long[] i:a)
    Arrays.fill(i,0);
    a[0][0]=1;
    for(int i=1;i<n;i++)
    {a[i][0]=moduloMultiplication((k-1),a[i-1][1],1000000007);
    a[i][1]=(a[i-1][0]%1000000007+moduloMultiplication
    ((k-2),a[i-1][1],1000000007))%1000000007;}
    if(x==1)
    System.out.println(a[n-1][0]);
    else
    System.out.println(a[n-1][1]);}}
