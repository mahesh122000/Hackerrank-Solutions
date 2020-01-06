/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t-->0)
	{String c=s.next();
	int k=-1;
	for(int i=c.length()-1;i>=0;i--)
	{if(c.charAt(i)=='0')
	{k=i;break;}}
	if(k==-1)
	System.out.println("-1");
	else
	System.out.println(Integer.parseInt(c.substring(0,k+1),2));}
}}