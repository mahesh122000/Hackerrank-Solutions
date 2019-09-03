import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

   public static int max(int n,int m)
   {if(n>m)
   return n;
   else 
   return m;}

    public static void main(String[] args)
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {int n=s.nextInt();
    int v=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=s.nextInt();
    int arr[][]=new int[n+1][v+1];
    for(int i=0;i<=n;i++)
    {for(int j=0;j<=v;j++)
    {if(i==0)
    arr[i][j]=0;
    else if(j==0)
    arr[i][j]=0;
    else if(j>=a[i-1])
    {arr[i][j]=max(arr[i-1][j],a[i-1]+arr[i][j-a[i-1]]);}
    else
    arr[i][j]=arr[i-1][j];}}
    System.out.println(arr[n][v]);
    }}}