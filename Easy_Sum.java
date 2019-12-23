import java.io.*;
import java.math.*;
public class Solution {
    public static void main(String[] args)
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {long n=s.nextLong();
    long m=s.nextLong();
    long k=n%m;
    long p=n/m;
    System.out.println(p*(m*(m-1))/2+(k*(k+1))/2);}
    }} 