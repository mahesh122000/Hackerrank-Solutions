import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int t = s.nextInt();
       for(int i = 0 ; i < t ; i++) {
           long a1=s.nextLong();
           long a2=s.nextLong();
           long a3=s.nextLong();
           long sl=s.nextLong();
           long gn=s.nextLong();
           long min=0;
           min=a1;
           if(a1*2<a2)
           {}
           else
           {min=a2/2;
           a1=min;}
           if(a1*3<a3)
           {}
           else
           {min=a3/3;
           a1=min;}
           if(a1*6<sl)
           {}
           else
           {min=sl/6;
           a1=min;}
           if(a1*10<gn)
           {}
           else
           {min=gn/10;
           a1=gn;}
           System.out.println(min);}}}