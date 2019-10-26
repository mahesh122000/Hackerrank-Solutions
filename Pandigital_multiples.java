import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       long n=s.nextLong();
       long k=s.nextLong();
        long[] pan8={18,78,1728,1764,1782,1827,2178,2358,2718,2817,3564,3582,4176,4356};   long[] pan9={9,192,219,273,327,6729,6792,6927,7269,7293,7329,7692,7923,7932,9267,9273,9327};
        if(k==8)
        {for (long i : pan8)
        {if(i<=n)
        System.out.println(i);}}
        if(k==9)
        {for (long i:pan9)
        {if(i<=n)
        System.out.println(i);}}
    }
}