public class PracticeQuickSort {

    public static int Partition(int arr[], int firsti, int lasti) {
        int pivot = arr[firsti];
        int count = 0;
        int i = firsti, j = lasti;

        for (int k = firsti + 1; k <= lasti; k++) {

            if (arr[k] <= pivot) {
                count++;
            }
        }
        int pivoti = firsti + count;

        // swap(arr, arr[pivoti], arr[firsti]);

        int temp = arr[pivoti];
        arr[pivoti] = arr[firsti];
        arr[firsti] = temp;

        while (i < pivoti && j > pivoti) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                // swap(arr, arr[i++], arr[j--]);
                int temp2 = arr[i++];
                arr[i++] = arr[j--];
                arr[j--] = temp2;
            }
        }
        return pivoti;
    }

    public static void QuickSort(int arr[], int firsti, int lasti) {
        if (firsti >= lasti) {
            return;
        }

        int p = Partition(arr, firsti, lasti);
        QuickSort(arr, firsti, p - 1);
        QuickSort(arr, p + 1, lasti);

    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 11, 0, 5, 11, 8 };
        QuickSort(arr, 0, 6);

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
