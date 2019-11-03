import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long a[]=new long[n];
        long ans=0;
        for(int i=0;i<n;i++)
        {a[i]=s.nextLong();}
        for(int i=1;i<n;i++)
        {a[0]=a[0]%1000000007+a[i]%1000000007+(a[0]*a[i])%1000000007;}
        System.out.println(a[0]%1000000007);}
    }