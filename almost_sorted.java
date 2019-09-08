import java.io.*;
import java.math.*;
import java.util.*;


public class Solution {

       public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long a[]=new long[n];
        long b[]=new long[n];
        long d[]=new long[n];
        for(int i=0;i<n;i++)
        {a[i]=s.nextInt();
        b[i]=a[i];
        d[i]=a[i];}
        Arrays.sort(b);
        int p=0,q=0;
        for(int i=0;i<n;i++)
        {if(a[i]!=b[i])
        {p=i;break;}}
        for(int i=n-1;i>0;i--)
        {if(a[i]!=b[i])
        {q=i;break;}}
        //System.out.println(p+" "+q);
        int l=q-p+1;
        long c[]=new long[l];
        for(int i=0;i<l;i++)
        {c[i]=a[q-i];}
        for(int i=0;i<l;i++)
        {a[p+i]=c[i];}
        long te=d[p];
        d[p]=d[q];
        d[q]=te;
        

      boolean flag1=false;
       for(int i=0;i<n;i++)
        {if(b[i]==d[i])
        {flag1=true;}
        else
        {flag1=false;
        break;}}
        if(flag1)
        {System.out.println("yes");
        p+=1;
        q+=1;
        System.out.println("swap "+p+" "+q);}
        else
        {boolean flag=false;
       for(int i=0;i<n;i++)
        {if(a[i]==b[i])
        {flag=true;}
        else
        {flag=false;
        break;}}
        if(flag)
        {System.out.println("yes");
        int ll=q-p+1;
        p+=1;
        q+=1;
        if(ll==2)
        {System.out.println("swap "+p+" "+q);}
        else
        System.out.println("reverse "+p+" "+q);}
        else
        {System.out.println("no");}}}}