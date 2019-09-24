import java.io.*;
import java.math.*;
import java.util.*;

public class Solution{
static int gcd(int n1, int n2){
        if (n2 != 0)
            return gcd(n2, n1%n2);
        else 
            return n1;
    }
    public static void main(String[] args) throws IOException {
    Scanner s= new Scanner(System.in);
        int x1,x2,y1,y2,t;
        t=s.nextInt();
        for(int i=0;i<t;i++){
            x1 = s.nextInt();
            y1 = s.nextInt();
            x2 = s.nextInt();
            y2 = s.nextInt();
            System.out.println(gcd(Math.abs(y2-y1), Math.abs(x2-x1)) - 1);}
    }}