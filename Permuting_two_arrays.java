import java.io.*;
import java.util.*;


public class Solution {

    

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {int n=s.nextInt();
    long k=s.nextLong();
    long a[]=new long[n];
    long b[]=new long[n];
    for(int i=0;i<n;i++)
     a[i]=s.nextLong();
    for(int i=0;i<n;i++)
     b[i]=s.nextLong();
    Arrays.sort(a);
    Arrays.sort(b);
    boolean flag=false;
    for(int i=0,j=n-1;i<n;i++,j--)
    {if(a[i]+b[j]>=k)
    {flag=true;}
    else{flag=false;break;}}
    if(flag)
     System.out.println("YES");
    else
     System.out.println("NO");}}}