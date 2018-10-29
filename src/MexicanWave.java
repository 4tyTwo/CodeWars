public class MexicanWave {

    // Source: https://www.codewars.com/kata/58f5c63f1e26ecda7e000029

    public static String[] wave(String str) {
        char[] charArr = str.toCharArray();
        char[] tmp = new char[charArr.length];
        int i = 0;
        String[] result = new String[str.replace(" ", "").length()];
        for (int j = 0; j < charArr.length; ++j) {
            if (charArr[j] != ' ') {
                System.arraycopy(charArr, 0, tmp, 0, charArr.length);
                tmp[j] = Character.toUpperCase(tmp[j]);
                result[i++] = String.copyValueOf(tmp);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        for (String i : MexicanWave.wave("two words"))
            System.out.println(i);
    }

}