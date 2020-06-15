import java.io.*;
import java.util.*;

public class Solution {


    public static void main(String[] args) 
    {
         Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {int n=s.nextInt();
        int a[]=new int[n];
        int k=0;
        int r=s.nextInt();
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        k=a[0];
        for(int i=1;i<n;i++)
        k^=a[i];
        if(k==0)
        System.out.println("Second");
        else
        System.out.println("First");
        }
    }
}