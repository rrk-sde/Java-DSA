public class PracticeSelectionSort {

    static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 5, 11, 0 };
        SelectionSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
