package review;

public class linearSearch {

    public static int findNum(int[] a, int n) {
        int index = -1;
/*
        for (int i = 0; i<a.length; i++) {
            if (a[i] == n) index = i;
        }
        */

        int i = 0;
        while (i < a.length) {
            System.out.println("Loop "+i);
            if (a[i] == n) index = i;
            i++;
        }

        return index;
    }
    public static void main(String[] args) {
        int a[] = {10, 2, 3, 3, 7, 9 , 20};
        System.out.println("The number located at "+findNum(a, 20));
    }
}
