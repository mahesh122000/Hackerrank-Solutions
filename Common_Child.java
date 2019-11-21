import java.io.*;
import java.util.*;


public class Solution {


    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    String a=s.next();
     String b=s.next();
     int n=a.length();
     int m=b.length();
    int ans[][]=new int[n+1][m+1];
    for(int i=0;i<=n;i++)
    {for(int j=0;j<=m;j++)
    {if(i==0 || j==0)
     ans[i][j]=0;
    else
    {if(a.charAt(i-1)==b.charAt(j-1))
     ans[i][j]=ans[i-1][j-1]+1;
    else 
    {ans[i][j]=Math.max(ans[i-1][j],ans[i][j-1]);}}}}
    System.out.println(ans[n][m]);}}