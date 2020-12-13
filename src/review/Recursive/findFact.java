package review.Recursive;

public class findFact {

    void process(int n) {
        System.out.println("The Factorial of "+n+" is: "+F(n));
    }

    int F(int n) {
        if (n == 1 || n==0) {
            return 1;
        } else {
            return (n * F(n-1));
        }
    }


    public static void main(String[] args) {
        findFact obj = new findFact();
        obj.process(4);
    }
}
