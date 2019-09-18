import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    long a[]=new long[n];
    for(int i=0;i<n;i++)
    a[i]=s.nextLong();
    long count=0;
    int j=1;
    long b[]=new long[n];
    long c[]=new long[n];
    b[0]=1;
    c[n-1]=1;
    for(int i=1;i<n;i++)
    {if(a[i]<=a[i-1])
    {j=1;
    b[i]=j;
    }
    else
    {j++;
    b[i]=j;}}
    for(int i=n-2;i>=0;i--)
    {if(a[i]<=a[i+1])
    {j=1;
    c[i]=j;
    }
    else
    {j++;
    c[i]=j;}}
    for(int i=0;i<n;i++)
    {count+=Math.max(c[i],b[i]);}
    System.out.println(count);}}

