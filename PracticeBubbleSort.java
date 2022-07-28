
public class PracticeBubbleSort {
    static void BubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 12, 11, 10 };
        BubbleSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
