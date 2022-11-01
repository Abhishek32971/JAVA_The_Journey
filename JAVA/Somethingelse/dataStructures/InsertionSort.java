
public class InsertionSort {
    public static void insertionSort(int arr[]) {
        int temp;// store the current value from considering i=1
        int j;
        // Traverse an array from left to right
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 2, 9, 1 };
        // sort an array
        insertionSort(arr);
        // Print the sorted array
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
