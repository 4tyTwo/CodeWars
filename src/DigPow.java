public class DigPow {

    // Source: https://www.codewars.com/kata/5552101f47fc5178b1000050

    public static long digPow(int n, int p) {
        int[] number = convertToIntArray(n);
        int sum = 0;
        for (int i : number)
            sum += (int) Math.pow(i, p++);
        return sum % n == 0 ? sum/n : -1;
    }

    private static int[] convertToIntArray(int n) {
        char[] charArr = String.valueOf(n).toCharArray();
        int[] res = new int[charArr.length];
        for (int i = 0; i < charArr.length; ++i)
            res[i] = Character.getNumericValue(charArr[i]);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(DigPow.digPow(89, 1)); // 1
        System.out.println(DigPow.digPow(92, 1)); // -1
        System.out.println(DigPow.digPow(695, 2)); // 2
        System.out.println(DigPow.digPow(46288, 3)); // 51
    }
}