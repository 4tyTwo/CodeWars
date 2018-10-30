class RevRot {

    // Source: https://www.codewars.com/kata/reverse-or-rotate

    public static String revRot(String string, int sz) {
        if (string.equals("") || sz <= 0 || sz > string.length())
            return "";
        StringBuilder sb = new StringBuilder();
        int len = (int) Math.floor((string.length() + 0.0)/sz), start, finish;
        String tmp;
        for (int i = 0; i < len; ++i) {
            start = sz * i;
            finish = sz * (i+1);
            tmp = string.substring(start, finish);
            if (isCubicSumEven(tmp))
               sb.append(reverse(tmp));
            else
               sb.append(shift(tmp));
        }
        return sb.toString();
    }

    private static boolean isCubicSumEven(String num) {
        int cubicSum = 0;
        for (char c : num.toCharArray())
           cubicSum += (int) Math.pow(c - '0', 3); // Numeric value of char cubed
        return cubicSum % 2 == 0;
    }

    private static String shift(String s) {
        char[] charArr = s.toCharArray();
        char tmp = charArr[0];
        System.arraycopy(charArr,  1, charArr, 0, charArr.length - 1 );
        charArr[charArr.length - 1] = tmp;
        return String.valueOf(charArr);
    }

    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(RevRot.revRot("733049910872815764", 5));
    }
}