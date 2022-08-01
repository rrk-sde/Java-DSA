public class PracticeQuickSortb {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int arr[], int pivot, int low, int high) {
        int i = low, j = high;
        while (i <= high) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }
        return (j - 1);
    }

    static void QuickSort(int arr[], int low, int high) {
        if (low > high) {
            return;
        }
        int pivot = arr[high];
        int pi = partition(arr, pivot, low, high);
        QuickSort(arr, low, pi - 1);
        QuickSort(arr, pi + 1, high);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 5, 11, 8 };
        QuickSort(arr, 0, 6);

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
