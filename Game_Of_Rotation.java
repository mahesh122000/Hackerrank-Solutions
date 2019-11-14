import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long a[]=new long[n];
        long sum=0;
        long max=Long.MIN_VALUE;
        for(int i=0;i<n;i++)
            a[i]=s.nextLong();
        long val=0;
        for(int i=0;i<n;i++)
        {val+=(i+1)*a[i];
        sum+=a[i];}
        if(val>max)
            max=val;
        int j=1;
        while(j<n)
        {val=val-sum+(n)*a[j-1];
        if(val>max)
         max=val;
        j++;}
        System.out.println(max);}
    }