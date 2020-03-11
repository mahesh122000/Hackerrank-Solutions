import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {int n=s.nextInt();
        int a[][]=new int[2*n][2*n];
        for(int i=0;i<2*n;i++)
        {for(int j=0;j<2*n;j++)
        a[i][j]=s.nextInt();}
        int ans=0;
        int k=2*n;
        for(int i=0;i<n;i++)
        {for(int j=0;j<n;j++)
        {int kk=Math.max(a[i][j],Math.max(a[i][k-j-1],Math.max(a[k-i-1][j],a[k-i-1][k-j-1])));//System.out.print(kk+" ");
        ans+=kk;}}
        System.out.println(ans);}}
    } 