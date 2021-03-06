import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

     static int[][] chess= {
            {0,0,1,1,0,0,1,1,0,0,1,1,0,0,1},
            {0,0,2,1,0,0,1,1,0,0,1,1,0,0,1},
            {1,2,2,2,3,2,2,2,3,2,2,2,3,2,1},
            {1,1,2,1,4,3,2,3,3,3,2,3,3,3,1},
            {0,0,3,4,0,0,1,1,0,0,1,1,0,0,1},
            {0,0,2,3,0,0,2,1,0,0,1,1,0,0,1},
            {1,1,2,2,1,2,2,2,3,2,2,2,3,2,1},
            {1,1,2,3,1,1,2,1,4,3,2,3,3,3,1},
            {0,0,3,3,0,0,3,4,0,0,1,1,0,0,1},
            {0,0,2,3,0,0,2,3,0,0,2,1,0,0,1},
            {1,1,2,2,1,1,2,2,1,2,2,2,3,2,1},
            {1,1,2,3,1,1,2,3,1,1,2,1,4,3,1},
            {0,0,3,3,0,0,3,3,0,0,3,4,0,0,1},
            {0,0,2,3,0,0,2,3,0,0,2,3,0,0,2},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1}
            
    };
    static String chessboardGame(int[][] coins) {        
        int xor = 0;
        for (int[] Y : coins) {
            int x = Y[0]-1;
            int y = Y[1]-1;
         
                xor^=chess[x][y];
        }
        if (xor == 0)
            return "Second";
        return "First";
     }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int k = Integer.parseInt(scanner.nextLine().trim());

            int[][] coins = new int[k][2];

            for (int coinsRowItr = 0; coinsRowItr < k; coinsRowItr++) {
                String[] coinsRowItems = scanner.nextLine().split(" ");

                for (int coinsColumnItr = 0; coinsColumnItr < 2; coinsColumnItr++) {
                    int coinsItem = Integer.parseInt(coinsRowItems[coinsColumnItr].trim());
                    coins[coinsRowItr][coinsColumnItr] = coinsItem;
                }
            }

            String result = chessboardGame(coins);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}

/*
Function to fill the array
static int[][] nimbers(final int side){
	int[][] nb=new int[side][side];
	for(int j=2;j<2*side-1;++j){
	    int i=j<side?0:j-side+1;
	    int k=j<side?j:side-1;
	    while(i<=k){
		boolean[] seen=new boolean[4+1];
		if(i>1){
		    seen[nb[i-2][k-1]]=true;
		    if(k!=side-1) seen[nb[i-2][k+1]]=true;
		}
		if(k>1){
		    if(i!=0) seen[nb[i-1][k-2]]=true;
		    if(i!=side-1) seen[nb[i+1][k-2]]=true;
		}
		int l=0;
		while(seen[l]) ++l;
		nb[i][k]=l;
		nb[k][i]=l;
		++i;
		--k;
	    }
	}
	return nb;
    }
*/
