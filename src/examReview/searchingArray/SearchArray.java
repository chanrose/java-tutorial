package examReview.searchingArray;

public class SearchArray {
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

    public int linearSearch(int arr[], int value) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int arr[], int low, int high, int value) {
        if (high >= low) {
            int mid = (high - low) /2 + low;
            System.out.println("Middle is in index: "+mid);

            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value) {
                return binarySearch(arr, low, mid - 1, value);
            }
            return binarySearch(arr, mid + 1, high, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchArray obj = new SearchArray();
        int[] arr = {2, 83, 9, 6, 50, 26, 7, 79, 15};
        System.out.println("The unsorted array is ");
        obj.printArr(arr);
        System.out.println("The array is sorting ");
        obj.quickSort(arr, 0, arr.length - 1);
        System.out.println("The sorted array is ");
        obj.printArr(arr);

        int value = 79;
        System.out.println("Binary Search of " +value);
        int index = obj.binarySearch(arr, 0, arr.length -1, value);
        System.out.println("Found in index of "+index);



    }
}
