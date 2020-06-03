import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] a, int[] q) {
    int ans[]=new int[q.length];
    for(int i=0;i<q.length;i++)
    {ans[i]=find(a,q[i]);
    }
    return ans;
    }
    static int find(int a[],int k)
    {
        int n=a.length;
        Deque<Integer>dq=new LinkedList<>();
        int left=0,right=0,i=0;
        int max=0,min=Integer.MAX_VALUE;
        while(right<n)
        {
            int val=a[right];
            while(!dq.isEmpty() && val>dq.getLast())
                dq.removeLast();
            dq.add(val);
            right++;
            if(right-left==k)
            {max=dq.getFirst();
            min=Math.min(min,max);
            if(a[left]==dq.getFirst())
                dq.removeFirst();
            left++;}
        }
        return min;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nq[0]);

        int q = Integer.parseInt(nq[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr]);
            arr[arrItr] = arrItem;
        }

        int[] queries = new int[q];
        for (int queriesItr = 0; queriesItr < q; queriesItr++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[queriesItr] = queriesItem;
        }
        int[] result = solve(arr, queries);
        
        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }  

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

