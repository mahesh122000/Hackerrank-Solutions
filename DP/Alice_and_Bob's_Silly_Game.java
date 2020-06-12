import java.io.*;
import java.util.*;

public class Solution {
    static int a[];
    static void fill()
    {
        a[0]=0;
        a[1]=0;
        a[2]=1;
        a[3]=2;
        for(int i=5;i<a.length;i+=2)
        {if(prime(i))
        a[i]=1;}
        for(int i=4;i<a.length;i++)
        a[i]+=a[i-1];
    }
    static boolean prime(int n)
    {
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {if(n%i==0)
        return false;}
        return true;
    }
    public static void main(String[] args) 
    {
        a=new int[100001];
        Scanner s=new Scanner(System.in);
        fill();
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int k=a[n];
            if(k%2==1)
            System.out.println("Alice");
            else
            System.out.println("Bob");
        }
    }
}