public class InsertionSort {

    // Insertion Sort method
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Element to be inserted
            int j = i - 1;

            // Shift elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                // k
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // Place key in correct position
        }
    }

    // Print array helper
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11, 234 };

        System.out.print("Before sorting: ");
        printArray(arr);

        insertionSort(arr);

        System.out.print("After sorting:  ");
        printArray(arr);
    }
}

// tumne init krdia ab bss add kro commit kro fir url add kro then push -u
// origin main