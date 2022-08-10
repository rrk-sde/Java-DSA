
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 4, 8, 12, 3, 12, 1, 2 };
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Bubble(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
