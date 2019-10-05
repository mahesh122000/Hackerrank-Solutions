import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

    

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String c[]=new String[n];
        int t=n;
        for(int i=0;i<n;i++)
        c[i]=s.next();
        int cc[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {for(int j=0;j<n;j++)
        {cc[i][j]=(int)c[i].charAt(j)-48;}}
        for(int i=1;i<n-1;i++)
        {for(int j=1;j<n-1;j++)
        {if(cc[i][j]>cc[i][j-1] && cc[i][j]>cc[i-1][j] && cc[i][j]>cc[i][j+1]&& cc[i][j]>cc[i+1][j])
        cc[i][j]=40;}}
        char ccc[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {for(int j=0;j<n;j++)
        {ccc[i][j]=(char)(cc[i][j]+48);}}
        for(int i=0;i<n;i++)
        {for(int j=0;j<n;j++)
        System.out.print(ccc[i][j]);
        System.out.println();}
    }}