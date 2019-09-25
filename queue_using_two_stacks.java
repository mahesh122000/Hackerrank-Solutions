import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    Stack<Integer>s1=new Stack<Integer>();
    Stack<Integer>s2=new Stack<Integer>();
    while(t-->0)
    {int n=s.nextInt();
    if(n==1)
    {int k=s.nextInt();
    s1.push(k);}
    else
    {if(s2.empty())
        {while(!s1.empty())
    {s2.push(s1.peek());
    s1.pop();}}
    if(n==2)
    s2.pop();
    else
     System.out.println(s2.peek());}
       }
    }
    }