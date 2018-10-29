import java.util.Arrays;
import java.util.stream.IntStream;

public class EqualSidesKata {

    // Source: https://www.codewars.com/kata/5679aa472b8f57fb8c000047

    public static int findEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            if (sum(Arrays.copyOfRange(arr, 0, i)) == sum(Arrays.copyOfRange(arr, i + 1, arr.length)))
                return i;
        }
        return -1;
    }

    private static int sum(int[] arr) {
        return IntStream.of(arr).sum();
    }

    public static void main(String[] args) {
        System.out.println(EqualSidesKata.findEvenIndex(new int[] {1,2,3,4,3,2,1})); // 3
        System.out.println(EqualSidesKata.findEvenIndex(new int[] {1,100,50,-51,1,1})); // 1
        System.out.println(EqualSidesKata.findEvenIndex(new int[] {1,2,3,4,5,6})); // -1
        System.out.println(EqualSidesKata.findEvenIndex(new int[] {20,10,30,10,10,15,35})); // 3
    }
}
