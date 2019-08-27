import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

    public static int max(int a,int b)
    {if(a>b)
    return a;
    else
    return b;}


    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String c1=s.next();
        String c2=s.next();
        int l1=c1.length();
        int l2=c2.length();
        int a[][]=new int[l1+1][l2+1];
        for(int i=0;i<=l1;i++)
        {for(int j=0;j<=l2;j++)
        {if(i==0 || j==0)
        a[i][j]=0;}}
        for(int i=1;i<=l1;i++)
        {for(int j=1;j<=l2;j++)
        {if(c1.charAt(i-1)==c2.charAt(j-1))
        {a[i][j]=a[i-1][j-1]+1;}
        else
        {a[i][j]=max(a[i][j-1],a[i-1][j]);}}}
        int count=0;
        int ma=a[l1][l2];
        System.out.println(ma);}}