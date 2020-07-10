import java.io.*;
import java.util.*;

public class Solution {


    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int xor=0;
            for(int i=0;i<n;i++)
            {
                int m=s.nextInt();
                int k=s.nextInt();
                int val=0;
                if(m!=2)
                {
                    val=2-(m&1);
                }
                xor=(i==0)?val:val^xor;
            }
            System.out.println(xor==0?"BEN":"BOB");
        }
    }
}

