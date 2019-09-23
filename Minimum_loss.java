import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        TreeSet<Long> values = new TreeSet<>();
        values.add(s.nextLong());
        long min = Long.MAX_VALUE;
        for (int i = 1; i <n; i++) {
            long value = s.nextLong();
            Long higher = values.higher(value);
            if (higher != null) {
                min = Math.min(min, Math.abs(higher - value));
            }
            values.add(value);
        }
        System.out.println(min);
    }
}
