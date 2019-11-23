import java.io.*;
import java.util.*;

public class Solution {
    static boolean isPrime(int n) 
    {   if (n <= 1) return false; 
        if (n <= 3) return true; 
        if (n % 2 == 0 || n % 3 == 0) return false; 
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
            return false; 
        return true; 
    }
    public static int ans(long n)
    {int count=0;
    for(int i=2;i<=n;i++)
    {if(isPrime(i))
     count++;}
    return count;}
   

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {int n=s.nextInt();
    long a[]=new long[100];
    a[0]=0;
    a[1]=a[2]=a[3]=1;
    a[4]=2;
    for(int i=5;i<=n;i++)
    {a[i]=a[i-1]+a[i-4];}
     System.out.println(ans(a[n]));}}}