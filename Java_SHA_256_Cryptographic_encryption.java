import java.io.*;
import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args)throws Exception {
       Scanner s=new Scanner(System.in);
       MessageDigest md=MessageDigest.getInstance("SHA-256");
       md.reset();
       md.update(s.nextLine().getBytes());
       for(byte b:md.digest())
       System.out.format("%02x",b);
    }
}