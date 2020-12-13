package examReview.recursive;

public class Factorial {
    Factorial() {

    }

    public int fact(int n) {
/*        if (n >= 1) {
            return (n)*fact(n-1);
        } else {
            return 1;
        }*/

        if (n == 0 || n == 1)
            return 1;
        else
            return n * fact(n-1);
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        int input = 4;

        System.out.println("The input of " + input + "! is " + obj.fact(input));
    }
}
