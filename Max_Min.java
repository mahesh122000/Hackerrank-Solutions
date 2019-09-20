import java.io.*;
import java.math.*;
import java.util.*;


public class Solution {

   

    public static void main(String[] args)
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    long a[]=new long[n];
    for(int i=0;i<n;i++)
    a[i]=s.nextInt();
    Arrays.sort(a);
    long min=99999999;
    for(int i=0;i<n-k+1;i++)
    {long b=a[i+k-1]-a[i];
    if(min>b)
    min=b;}
    System.out.println(min);}}