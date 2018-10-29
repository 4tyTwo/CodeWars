public class PhoneNumberKata {

    // Source: https://www.codewars.com/kata/525f50e3b73515a6db000b83

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray() );
    }

    public static void main(String[] main){
        System.out.print(PhoneNumberKata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
