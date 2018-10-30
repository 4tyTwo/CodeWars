public class HumanReadableTime {

    // Source: https://www.codewars.com/kata/52685f7382004e774f0001f7

    public static String makeReadable(int seconds) {
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }

    public static void main(String[] args) {
        System.out.println(HumanReadableTime.makeReadable(25000));
    }
}