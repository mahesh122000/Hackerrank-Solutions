import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    long a[]=new long[n];
    long sum=0;
    long ans=0;
    for(int i=0;i<n;i++)
    {a[i]=s.nextLong();
    sum+=a[i];
    ans=ans+(i+1)*a[i];}
    long max=ans;
    for(long k:a)
    {ans=ans-sum+k*n;
    max=Math.max(max,ans);}
    System.out.println(max);
    }}
