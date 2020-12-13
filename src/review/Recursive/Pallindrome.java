package review.Recursive;

public class Pallindrome {


    static boolean checkPallin(String text) {
        if (text.length() ==0 || text.length() == 1) {
            return true;
        }

        if(text.charAt(0) == text.charAt(text.length() - 1)) {
            return checkPallin(text.substring(1, text.length() -1));
        }
        return false;
    }
    public static void main(String[] args) {
        String pal= "holoh";
        System.out.println(checkPallin("m101m"));

    }

}
