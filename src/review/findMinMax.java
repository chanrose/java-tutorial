package review;

public class findMinMax {

    public static int findIndexOfMin(int[] numbers) {
        int index = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int findIndexOfMax(int[] numbers) {
        int index = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] a = new int[] {99, 5, 0, 2, 3};
        System.out.println(findIndexOfMax(a));
    }
}
