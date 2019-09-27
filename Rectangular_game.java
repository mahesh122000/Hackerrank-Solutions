import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

   
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long r=9999999;
        long l=9999999;
        for(int i=0;i<n;i++)
        {long p=s.nextLong();
        long q=s.nextLong();
        if(r>p)
        r=p;
        if(l>q)
        l=q;}
        System.out.println(r*l);
    }}