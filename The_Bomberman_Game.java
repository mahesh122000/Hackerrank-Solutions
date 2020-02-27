import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {


    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int row=s.nextInt();
    int col=s.nextInt();
    int t=s.nextInt();
    char p[][]=new char[row][col];
    char q[][]=new char[row][col];
    char r[][]=new char[row][col];
    char st[][]=new char[row][col];
    
    for(int i=0;i<row;i++)
    {String c=s.next();
    for(int j=0;j<col;j++)
    p[i][j]=c.charAt(j);}
    for(int i=0;i<row;i++)
    {for(int j=0;j<col;j++)
    {q[i][j]=r[i][j]=st[i][j]='O';}}
    
    for(int i=0;i<row;i++)
    {for(int j=0;j<col;j++)
    {if(p[i][j]=='O')
    {q[i][j]='.';
    if(i+1<row)
    q[i+1][j]='.';
    if(i-1>=0)
    q[i-1][j]='.';
    if(j+1<col)
    q[i][j+1]='.';
    if(j-1>=0)
    q[i][j-1]='.';}}}

    for(int i=0;i<row;i++)
    {for(int j=0;j<col;j++)
    {if(q[i][j]=='O')
    {r[i][j]='.';
    if(i+1<row)
    r[i+1][j]='.';
    if(i-1>=0)
    r[i-1][j]='.';
    if(j+1<col)
    r[i][j+1]='.';
    if(j-1>=0)
    r[i][j-1]='.';}}}

    if(t==0 || t==1)
    {for(int i=0;i<row;i++)
    {for(int j=0;j<col;j++)
    System.out.print(p[i][j]);
    System.out.println();}}
    else if((t-1)%4==0)
    {for(int i=0;i<row;i++)
    {for(int j=0;j<col;j++)
    System.out.print(r[i][j]);
    System.out.println();}}
    else if((t-1)%2==0)
    {for(int i=0;i<row;i++)
    {for(int j=0;j<col;j++)
    System.out.print(q[i][j]);
    System.out.println();}}
    else
    {for(int i=0;i<row;i++)
    {for(int j=0;j<col;j++)
    System.out.print(st[i][j]);
    System.out.println();}}
    }}


   