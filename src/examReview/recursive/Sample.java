package examReview.recursive;

public class Sample {
    public static long multiplication(long a, long b) {
        if (b == 0) {
            return b;
        }
        return a + multiplication(a, b - 1);
    }
    public static void main(String[] args) {
        System.out.println(multiplication(3,0));
    }
}
