import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

   

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {long n=s.nextLong();
    long k=n/2;
    long l=n-k;
    System.out.println(k*l);}}}