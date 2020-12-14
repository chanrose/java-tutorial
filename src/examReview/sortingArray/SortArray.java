package examReview.sortingArray;

public class SortArray {

    public boolean checkArray(int arr[]) {
        boolean isSort = true;
        int length = arr.length;
        int startIndex = 0;
        for (int i = 1; i < length; i++ ) {
            if (arr[startIndex] > arr[i]) {
                isSort = false;
                break;
            } else {
                startIndex++;
            }
        }
        return isSort;
    }
    public void bubbleSort(int arr[]) {
        // What does bubbleSort do?
        // It compare the first and the next index, if the next index is smaller, it will swap with the current index
        // Until everything is in adjacent order, it will complete

            int startIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[startIndex] > arr[i]) {
                    int temp = arr[startIndex];
                    arr[startIndex] = arr[i];
                    arr[i] = temp;
                }
                startIndex++;
            }



        // Calling itself recursively if array is not sorted yet
        if (!checkArray(arr)) {
            bubbleSort(arr);
        }

    }
    public void bubbleSort(int arr[], boolean recursive) {
        // What does bubbleSort do?
        // It compare the first and the next index, if the next index is smaller, it will swap with the current index
        // Until everything is in adjacent order, it will complete
        if (recursive == true) {
            bubbleSort(arr);
        }

        for (int l = 0; l < arr.length - 1; l++) {
            int startIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[startIndex] > arr[i]) {
                    int temp = arr[startIndex];
                    arr[startIndex] = arr[i];
                    arr[i] = temp;
                }
                startIndex++;
            }
        }
    }

    public void selectionSort(int arr[]) {
        // Selection sort is to pick the starting index and compare with the rest and if curr index is greater than, we swap them
        // If not we can begin to the next loop or next index and repeat the same things
        int length = arr.length;
        int curr = 0;

        while (curr < length) {
            for (int i = curr + 1; i < length; i++) {
                if (arr[curr] > arr[i]) {
                    int temp = arr[curr];
                    arr[curr] = arr[i];
                    arr[i] = temp;
                    printArr(arr);
                }
            }
            curr++;
        }

    }

    public void insertionSort(int arr[]) {
        int length = arr.length;
        int small = 0;
        for (int i = 1; i < length; i++) {
            // Checking if the current i index is smaller than the small index
            if (arr[i] < arr[small]) {
                // if it trues, sset the value of small to i;
                small = i;
                System.out.println("Small is "+arr[small] +", index: "+small);
                for (int l = i; l > 0; l--) {
                    if (arr[l] < arr[l - 1]) {
                        int temp = arr[l];
                        arr[l] = arr[l-1];
                        arr[l-1] = temp;
                        printArr(arr);
                        System.out.println("Swapping between "+arr[l]+" and "+ arr[l-1]);
                    }
                }
            }
        }

    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot -1);
            quickSort(arr, pivot + 1, high);
        }
    }
    public int partition (int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        printArr(arr);
        return (i+1); // This is the pivot element now

    }


    public void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        SortArray obj = new SortArray();
        int[] arr = {14, 1, 30, -3, 12};
        System.out.println("Unsorted array is ");
        obj.printArr(arr);
        System.out.println("ARR is sorting now: ");
        obj.quickSort(arr, 0, arr.length - 1);
        System.out.println("The sorted array is");
        obj.printArr(arr);




    }
}
