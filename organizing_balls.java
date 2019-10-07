import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

    
    public static void main(String[] args) 

       {Scanner s=new Scanner(System.in);
       int t=s.nextInt();
       while(t-->0)
       {int n=s.nextInt();
       long a[][]=new long[n][n];
       long b[]=new long[n];
       long c[]=new long[n];
       for(int i=0;i<n;i++)
       {for(int j=0;j<n;j++)
       a[i][j]=s.nextLong();}
       boolean flag=true;
       for(int i=0;i<n;i++)
       {for(int j=0;j<n;j++)
       {b[i]+=a[j][i];}}
       for(int i=0;i<n;i++)
       {for(int j=0;j<n;j++)
       {c[i]+=a[i][j];}}
      Arrays.sort(b);
      Arrays.sort(c);
      for(int i=0;i<n;i++)
      {
          if(b[i]==c[i])
          {flag=true;}
          else
          {flag=false;break;}
      }
       if(flag)
       System.out.println("Possible");
       else
       System.out.println("Impossible");
       }}}
