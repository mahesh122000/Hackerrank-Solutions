import java.io.*;
import java.util.*;

public class Solution {

    
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int count1=0;
        int count2=0;
        int b[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            b[i]=a[i];
            c[i]=a[i];
        }
        Arrays.sort(b);
        HashMap<Integer,Integer>hm1=new HashMap<>();
        HashMap<Integer,Integer>hm2=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hm1.put(a[i],i);
            hm2.put(a[i],i);
        }
        for(int i=0;i<n;i++)
        {
            int p=hm1.get(b[i]);
            int v=a[i];
            a[i]=b[i];
            a[p]=v;
            hm1.put(a[i],i);
            hm1.put(a[p],p);
            if(i==p)
            {}
            else
            count1++;
        }
        for(int i=n-1;i>=0;i--)
        {
           int p=hm2.get(b[i]);
            int v=c[i];
            c[i]=b[i];
            c[p]=v;
            hm2.put(c[i],i);
            hm2.put(c[p],p);
            if(i==p)
            {}
            else
            count2++; 
        }
        System.out.println(Math.min(count1,count2));
    }
    }