public class SelectionSort_OPT1 {

    public static void main(String[] args) {
        int[] arr = { 2, 12, 3, 55, 6 };
        selecSortOPT(arr);
    }

    private static void selecSortOPT(int[] arr) {
        int n = arr.length;
         for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
               
            }
            swap(arr, min, i);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
