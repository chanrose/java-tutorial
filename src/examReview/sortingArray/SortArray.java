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


    public void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        SortArray obj = new SortArray();
        int[] arr = {4, 1, 10, -3, 12};
        System.out.println("Unsorted array is ");
        obj.printArr(arr);
        obj.bubbleSort(arr, true);
        obj.printArr(arr);



    }
}
