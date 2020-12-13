package review;

import java.util.Scanner;
public class SAMPLE {
Scanner sc;
String Vehicle[];

    SAMPLE() {
        sc = new Scanner(System.in);
        // Constructor is to assign the value
        System.out.println("Please enter the maximum length of Array");
        int n = sc.nextInt();
        Vehicle = new String[n];
    }

    // Input Data to Array
    void inputData() {

        for (int i = 0; i < Vehicle.length; i++) {
            System.out.println("Please enter the Vehicle Name: ");
            Vehicle[i] = sc.nextLine();
        }
    }

    // Display Array
    void displayData() {
        for (int i = 0; i < Vehicle.length; i++) {
            System.out.println("Vehicle["+i+"]: "+ Vehicle[i]);
        }
    }


    public static void main(String[] args) {
        SAMPLE obj = new SAMPLE();
        obj.inputData();
        obj.displayData();

    }

}
