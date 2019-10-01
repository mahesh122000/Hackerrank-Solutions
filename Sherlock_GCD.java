import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
     
    

    static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    }  
   
    public static void main(String[] args)
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=s.nextInt();
    Arrays.sort(a);
    boolean flag=false;
    one:for(int i=0;i<n-1;i++)
    {int p=a[i];
        for(int j=i+1;j<n;j++)
    {if(a[i]==1 || a[j]==1 || gcd(a[j],p)==1)
    {flag=true;
    break one;}
    else
    {p=gcd(p,a[j]);flag=false;}}}
    if(flag)
    System.out.println("YES");
    else
    System.out.println("NO");} }
}
