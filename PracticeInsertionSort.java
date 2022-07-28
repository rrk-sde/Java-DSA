public class PracticeInsertionSort {

    static void InsertionSort(int arr[]) {

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int temp = arr[i];

            while (j > -1 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 5, 11, 0 };
        InsertionSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
