import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {int n=s.nextInt();
        int count=0;
        long max=0;
        for(int i=0;i<n;i++)
        {long k=s.nextLong();
        if(max<k)
        {count++;
        max=k;}}
        if(count%2==0)
        System.out.println("ANDY");
        else
        System.out.println("BOB");
        }
        }
    }
