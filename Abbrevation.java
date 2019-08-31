import java.io.*;
import java.math.*;
import java.util.*;


public class Solution {

  

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {String c1=s.next();
    String c2=s.next();
    int n=c1.length();
    int m=c2.length();
    boolean a[][]=new boolean[n+1][m+1];
    boolean containsupper=false;
    a[0][0]=true;
    for(int i=1;i<=n;i++)
    {if((int)c1.charAt(i-1)<=90 &&(int)c1.charAt(i-1)>=65 || containsupper)
    {a[i][0]=false;
    containsupper=true;}
    else
    a[i][0]=true;
    }
    for(int i=1;i<=n;i++)
    {for(int j=1;j<=m;j++)
    {if(c1.charAt(i-1)==c2.charAt(j-1))
    a[i][j]=a[i-1][j-1];
    else if((int)c1.charAt(i-1)-32==(int)c2.charAt(j-1))
    a[i][j]=a[i-1][j]||a[i-1][j-1];
    else if((int)c1.charAt(i-1)<=90 &&(int)c1.charAt(i-1)>=65)
    a[i][j]=false;
    else
    a[i][j]=a[i-1][j];}}
    if(a[n][m])
    System.out.println("YES");
    else
    System.out.println("NO");}
}}
