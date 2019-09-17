import java.io.*;
import java.math.*;
import java.util.*;


public class Solution {

   
    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=s.nextInt();
    Arrays.sort(a);
    int count=0;
    int d=n/m;
    int l=n%m;
    for(int j=0;j<d;j++)
    {for(int i=n-1-j*m;i>=n-(j+1)*m && i>=0;i--)
    {count+=(j+1)*a[i];
    //System.out.print(count+" ");
    }}
    for(int i=l-1;i>=0;i--)
    {count+=(d+1)*a[i];
   // System.out.print(count+" ");
    }
    System.out.println(count);}
}