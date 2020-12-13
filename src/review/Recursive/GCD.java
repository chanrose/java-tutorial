package review.Recursive;

public class GCD {
    int gcd;

    GCD() {
        gcd = 0;
    }
    void process(int a, int b) {
        System.out.println("The GCD of "+a+" & "+b+" is "+findGCD(a,b));
    }

    int findGCD(int a, int b) {

        if (b == 0) return a;
        else {
            return findGCD(b, a%b);
        }
    }

    public static void main(String[] args) {
        GCD obj = new GCD();
        obj.process(10, 15);
    }
}
