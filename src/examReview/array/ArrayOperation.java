package examReview.array;

public class ArrayOperation {

    public int[][] additionMatrix(int[][] a, int[][] b) {
       int length = a.length;
       int[][] c = new int[length][length];

       for (int i = 0; i < length; i++) {
           for (int l = 0; l < length; l++) {
               c[i][l] = a[i][l] + b[i][l];
           }
       }


        return c;
    }
    public void printMatrix(int[][] a) {
        for (int i[] : a) {
            System.out.print("[ ");
            for (int l : i) {
                System.out.print(l + " ");
            }
            System.out.print("] \n");
        }
    }

    public static void main(String[] args) {
        ArrayOperation obj = new ArrayOperation();
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] b = {
                {1, 2, 1},
                {5, 4, 3},
                {1, 7, 2}
        };

        int[][] c = obj.additionMatrix(a, b);
        obj.printMatrix(c);



    }
}
