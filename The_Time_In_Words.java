import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int h=s.nextInt();
        int m=s.nextInt();
        String[] hours ={"one", "two", "three", "four", "five", "six", "seven", 
                    "eight", "nine", "ten", "eleven", "twelve"};
        String[] minutes={"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "ninteen", "twenty","twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"};
        if(m>30)
        {
            m=60-m;
            if(m==1)
            {System.out.println(minutes[m-1]+" minute to "+hours[h]);}
            else if(m!=15)
            {System.out.println(minutes[m-1]+" minutes to "+hours[h]);}
            else
            {System.out.println(minutes[m-1]+" to "+hours[h]);}
        }
        else if(m==30)
        {System.out.println("half past "+hours[h-1]);}
        else
        {
            if(m==0)
            System.out.println(hours[h-1]+" o' clock");
            else if(m==1)
            {System.out.println(minutes[m-1]+" minute past "+hours[h-1]);}
            else if(m==15)
            {System.out.println(minutes[m-1]+" past "+hours[h-1]);}
            else
            {System.out.println(minutes[m-1]+" minutes past "+hours[h-1]);}
        }
    }}