public class Order {

    // Source: https://www.codewars.com/kata/your-order-please

    public static String order(String words) {
        String[] sepWords = words.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sepWords.length; ++i) {
            result.append(getNthWord(i + 1, sepWords) + " ");
        }
        return result.toString().trim();
    }

    private static String getNthWord(int n, String[] words) {
        for (String i : words)
            if (i.contains(String.valueOf(n)))
                return i;
        return "";
    }
    public static void main(String[] args) {
        System.out.println(Order.order("is2 Thi1s T4est 3a"));
    }
}
