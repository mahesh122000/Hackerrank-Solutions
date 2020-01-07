import java.io.*;
import java.math.*;
import java.util.*;


public class Solution {

   

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextLong();
        Arrays.sort(a);
        long p=s.nextLong();
        long q=s.nextLong();
        if(a[0]>q)
        System.out.println(p);
        else if(a[n-1]<p)
        System.out.println(q);
        else
        {long max=-1;
        long val=-1;
        if(a[0]>p && a[0]-p>max)
        {max=a[0]-p;val=p;}
        if(a[n-1]<q && q-a[n-1]>max)
        {max=q-a[n-1];val=q;}
        for(int i=0;i<n-1;i++)
        {long mid=(a[i]+a[i+1])/2;
        if(mid>=p && mid<=q && mid-a[i]>max)
        {max=mid-a[i];val=mid;}
        else if(mid>q && q-a[i]>max)
        {max=q-a[i];
        val=q;}
        else if(mid<p && a[i+1]-p>max)
        {max=a[i+1]-p;
        val=p;}}
        System.out.println(val);}
        }
    }