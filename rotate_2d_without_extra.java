import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 int a[][]=new int[n][n];
	 for(int i=0;i<n;i++)
	 {for(int j=0;j<n;j++)
	 {a[i][j]=s.nextInt();}}
	 for(int j=0;j<n;j++)
	 {for(int i=n-1;i>=0;i--)
	 System.out.print(a[i][j]+" ");}
	 System.out.println();}
	 }
}