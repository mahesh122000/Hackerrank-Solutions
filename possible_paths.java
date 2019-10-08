import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

   static int gcd(int a, int b) 
{ 
    if (b == 0) 
        return a; 
    return gcd(b, a % b);  
      
}

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {int a=s.nextInt();
        int b=s.nextInt();
        int x=s.nextInt();
        int y=s.nextInt();
        if(gcd(a,b)==gcd(x,y))
        System.out.println("YES");
        else
        System.out.println("NO");}
        
    }}
