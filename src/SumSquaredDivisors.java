import java.util.ArrayList;
import java.util.List;

public class SumSquaredDivisors {

    // Source: https://www.codewars.com/kata/integers-recreation-one

    public static String listSquared(long m, long n) {
        StringBuilder sb = new StringBuilder("[");
        for (long i = m; i < n; ++i) {
            if(isPerfectSquare(sumSquared(listDivisors(i)))) {
                sb.append("[" + String.valueOf(i) + ", " + String.valueOf(sumSquared(listDivisors(i))) + "], ");
            }
        }
        sb.append("]");
        String result = sb.toString();
        int lastIndex = result.lastIndexOf(", ");
        if (lastIndex != -1)
            return result.substring(0, lastIndex) + result.substring(lastIndex + 2, result.length());
        else
            return result;
    }

    private static Long[] listDivisors(long n) {
        List<Long> list = new ArrayList<>();
        for (long i=1; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i)
                    list.add(i);

                else {
                    list.add(i);
                    list.add(n / i);
                }
            }
        }
        return list.toArray(new Long[0]);
    }

    private static boolean isPerfectSquare(long n) {
        double sqrt = Math.sqrt(n);
        int x = (int) sqrt;
        return(Math.pow(sqrt,2) == Math.pow(x,2));
    }

    private static long sumSquared(Long[] values) {
        long sum = 0;
        for (long i : values)
            sum += (int) Math.pow(i, 2);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(listSquared(43, 50));
    }
}