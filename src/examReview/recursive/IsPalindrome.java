package examReview.recursive;

public class IsPalindrome {

    public boolean isPalindrome(String text) {
        // To create the max length
        int textLength = text.length();

        // Condition
        if (textLength == 1 || textLength == 0)
            return true;
        boolean recursive = text.charAt(0) == text.charAt(textLength - 1);
        // To check if the first index and the last index is matching or not, if true, match to the next one
        // if not, it will return false right away
        return recursive && isPalindrome(text.substring(1, textLength - 1)) ;


    }

    public static void main(String[] args) {
        IsPalindrome obj = new IsPalindrome();
        String text = "lol";
        System.out.println(obj.isPalindrome(text));

    }
}
