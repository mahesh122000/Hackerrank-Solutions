import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    long a[]=new long[n];
    long b[]=new long[n];
    long c[]=new long[n];
    for(int i=0;i<n;i++)
    {a[i]=s.nextLong();b[i]=a[i];
    c[i]=a[i];}
    int count=0;
    int count2=0;
    LinkedHashMap<Long,Integer>hm=new LinkedHashMap<>();
    LinkedHashMap<Long,Integer>hm2=new LinkedHashMap<>();
    for(int i=0;i<n;i++)
    {hm.put(a[i],i);
    hm2.put(a[i],i);}
    Arrays.sort(a);
    for(int i=0;i<n;i++)
    {if(a[i]!=b[i])
    {count++;
    int k=hm.get(a[i]);
    long temp=b[k];
    hm.put(b[k],i);
    hm.put(b[i],k);
    b[k]=b[i];
    b[i]=temp;
    }}
    long d[]=new long[n];
    for(int i=0,j=n-1;i<n;i++,j--)
    d[i]=a[j];
    for(int i=0;i<n;i++)
    {if(d[i]!=c[i])
    {count2++;
    int k=hm2.get(d[i]);
    long temp=c[k];
    hm2.put(c[k],i);
    hm2.put(c[i],k);
    c[k]=c[i];
    c[i]=temp;
    }}
    System.out.println(Math.min(count,count2));}
    }