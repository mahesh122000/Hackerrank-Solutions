import java.io.*;
import java.math.*;
import java.util.*;


public class Solution {
    
    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    int n=1000;
    int k=1000;
    long C[][]=new long[n+1][k+1]; 
    for (int i = 0; i <= n; i++) 
    { for (int j = 0; j <= Math.min(i, k); j++) 
        { if (j == 0 || j == i) 
                C[i][j] = 1; 
            else
                C[i][j] = (C[i-1][j-1]%1000000000 + C[i-1][j]%1000000000)%1000000000; 
        } 
    } 
    while(t-->0)
    {int m=s.nextInt();
    for(int i=0;i<=m;i++)
    {System.out.print(C[m][i]+" ");}
    System.out.println();}}}
