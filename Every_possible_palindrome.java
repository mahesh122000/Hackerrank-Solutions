/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static boolean isPalindrome(String c)
    {boolean flag=true;
    for(int i=0,j=c.length()-1;i<c.length()/2;i++,j--)
    {if(c.charAt(i)!=c.charAt(j))
    {flag=false;break;}}
    return flag;}
    
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String c=s.next();
	    String temp="";
	    int count=0;
	    for(int n=0;n<c.length()-1;n++)
	    {for(int k=n+1;k<c.length();k++)
	    {for(int i=k;i<c.length();i++)
	    {for(int j=i+1;j<=c.length();j++)
	        {temp=c.substring(n,k)+c.substring(i,j);
	        if(isPalindrome(temp))
	        {count++;
	       // System.out.println(temp);
	    }}}}}
	    System.out.println(count);}
}
