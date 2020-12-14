package examReview.sortingArray;

public class HeapSort {

    public void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        System.out.println("");
    }

    public void buildMaxHeap(int[] arr) {
        // Creates max heap from unsorted array

        // Swap the first and last element

        for (int end = arr.length - 1; end > 0; end--) {
            heapify(arr, end);
            int temp = arr[0];
            arr[0] = arr[end];
            arr[end] = temp;
        }


    }
    public void heapify(int[] arr, int end) {
        int length = end + 1; // Full length not index
        int root = arr[0];
        int largest = arr[0];

        for (int i = 0; i < length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            int chL = i * 2 + 1;
            int chR = i * 2 + 2;
            if (chL < length && arr[i] < arr[chL] ) {
                int temp = arr[i]; // Store parent value temporary
                arr[i] = arr[chL];
                arr[chL] = temp; // Transfered the temporary variable to the left child
                // System.out.println("Parent of "+arr[i]+" has the left child of "+arr[chL]);
            }
            if (chR < length && arr[i] < arr[chR] ) {
                int temp = arr[i]; // Store parent value temporary
                arr[i] = arr[chR];
                arr[chR] = temp; // Transfered the temporary variable to the right child
                // System.out.println("Parent of "+arr[i]+" has the right child of "+arr[chR]);
            }
        }
        if (largest != root) {
            heapify(arr, end);
        }
    }


    public static void main(String[] args) {
        // How does it works?
        // Create Max Heap
        // Remove the largest item
        // Place the item in the sorted array

        HeapSort obj = new HeapSort();
        int[] arr = {2, 8, 5, 3, 9, 1};
        System.out.println("Unsorted array is: ");
            obj.printArr(arr);
        obj.buildMaxHeap(arr);
        System.out.println("The sorted array is: ");
            obj.printArr(arr);



    }
}
