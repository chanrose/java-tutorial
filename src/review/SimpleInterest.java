package review;

public class SimpleInterest {

    public void PrintMe(String name) {
        System.out.println("Hello " + name);
    }


    public static void main(String[] args) {

        SimpleInterest model1 = new SimpleInterest();
        SimpleInterest model2 = new SimpleInterest();
        model1.PrintMe("Siam");
        model2.PrintMe("Broset");
    }
}
