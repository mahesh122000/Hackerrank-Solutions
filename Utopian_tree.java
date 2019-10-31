import java.io.*;
import java.util.*;

public class Solution {

  

    public static void main(String[] args)
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {int n=s.nextInt();
     if(n==0)
         System.out.println("1");
     else
     {int a[]=new int[n+1];
      a[0]=1;
      for(int i=1;i<=n;i++)
      {if(i%2==1)
       a[i]=a[i-1]*2;
      else
       a[i]=a[i-1]+1;}
     System.out.println(a[n]);}}}}