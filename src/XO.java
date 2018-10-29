public class XO {

    // Source: https://www.codewars.com/kata/55908aad6620c066bc00002a

    public static boolean getXO (String str) {
        int numX = str.length() - str.toLowerCase().replace("x", "").length();
        int numO = str.length() - str.toLowerCase().replace("o", "").length();
        return numX == numO;
    }

    public static void main(String[] args) {
        System.out.println(XO.getXO("xxxooo"));
        System.out.println(XO.getXO("xxxXooOo"));
        System.out.println(XO.getXO("xxx23424esdsfvxXXOOooo"));
        System.out.println(XO.getXO("xXxxoewrcoOoo"));
    }
}