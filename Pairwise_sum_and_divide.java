import java.io.*;
import java.util.*;

public class Solution {


    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {int n=s.nextInt();
        long a[]=new long[n];
        int count1=0,count2=0;
        for(int i=0;i<n;i++)
        {a[i]=s.nextLong();
        if(a[i]==1)
        count1++;
        else if(a[i]==2)
        count2++;}
        int k=n-count1;
        long ans=0;
        long kk=count1*(count1-1);
        if(kk<=0)
        kk=0;
        ans=ans+kk;
        ans=ans+k*count1;
        kk=(count2*(count2-1))/2;
        if(kk<=0)
        kk=0;
        ans=ans+kk;
        System.out.println(ans);}}
    } 