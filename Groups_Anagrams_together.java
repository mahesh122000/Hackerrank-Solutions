import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static String ans(String s)
     {char a[]=s.toCharArray();
     Arrays.sort(a);
     return new String(a);}
     
     
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 int a[]=new int[n];
	 String c[]=new String[n];
	 int b[]=new int[n];
	 for(int i=0;i<n;i++)
	 {String cc=s.next();a[i]=-1;
	 c[i]=ans(cc);}
	 for(int i=0;i<n;i++)
	 {int count=0;
	 if(a[i]==-1)
	 {for(int j=i;j<n;j++)
	 {if(c[i].equals(c[j]))
	 {count++;a[j]=1;}}}
	 b[i]=count;}
	 Arrays.sort(b);
	 for(int i=0;i<n;i++)
	 {if(b[i]!=0)
	 System.out.print(b[i]+" ");}
	 System.out.println();}
	 }
}