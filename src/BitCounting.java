public class BitCounting {

    // Source: https://www.codewars.com/kata/bit-counting

    public static int countBits(int n) {
        int counter = 0;
        for (char c : Integer.toString(n, 2).toCharArray())
            if (c == '1')
                ++counter;
        return counter;
    }

}