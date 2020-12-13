package review.Recursive;

public class Fibonacci {

    public static void main(String[] args) {
/*        int first = 0;
        int second = 1;
        int third = first + second;
        System.out.print(first + "  " + second + "  ");
        while (third < 50){
            System.out.print(third + "  ");
            first = second;
            second = third;
            third = first + second;
        }*/
        System.out.println(fib(60)+" ");

    }
    static int fib(int n)
    {
        if (n==0)
            return (0);

        else if (n==1 || n == 2)
            return (1);
        else
            return(fib(n-1)+fib(n-2));
    }
}
