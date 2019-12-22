import java.io.*;
import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args)throws Exception {
        Scanner s=new Scanner(System.in);
        MessageDigest md=MessageDigest.getInstance("MD5");
        md.reset();
        md.update(s.nextLine().getBytes());
        for(byte i:md.digest() )
        System.out.format("%02x",i);
    }
}
