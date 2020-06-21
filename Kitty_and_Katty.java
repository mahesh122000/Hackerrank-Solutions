import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int t=s.nextInt();
      while(t-->0)
      {
          int n=s.nextInt();
          if(n==1|n%2==0)
          System.out.println("Kitty");
          else
          System.out.println("Katty");
      }
    }
}