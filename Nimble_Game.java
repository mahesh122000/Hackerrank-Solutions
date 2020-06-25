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
                if((s.nextInt()%2)==1)
                xor^=i;
            }
            if(xor==0)
            System.out.println("Second");
            else
            System.out.println("First");
        }
    }
}