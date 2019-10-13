import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

    

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            long x=s.nextLong();
            long p=x;
            int count=0;
            while(x>0)
            {
            count++;
            x=x/2;}
            //System.out.print(count+" ");
            long ans=(long)Math.pow(2,count)-1-p;
            System.out.println(ans);}
        }
    }
