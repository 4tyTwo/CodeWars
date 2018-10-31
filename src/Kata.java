public class Kata {

    // Source: https://www.codewars.com/kata/576bb71bbbcf0951d5000044

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0)
            return new int[] {};
        int countPositives = 0, sumNegatives = 0;
        for (int i : input) {
            if (i > 0)
                ++countPositives;
            else if (i < 0)
                sumNegatives += i;
        }
        return new int[] {countPositive, sumNegatives};
    }

    public static void main(String[] args) {
       int[] res = Kata.countPositivesSumNegatives(null);
       System.out.println(res[0]);
       System.out.println(res[1]);
    }
}
