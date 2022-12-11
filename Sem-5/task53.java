public class task53 {
    public static void main(String[] args) {
        int arr[] = { 1, 7, 2, 11, 4, 0 };
        System.out.print("Unsorted array: "); 
        printArray(arr);

        task53 ex = new task53();
        ex.sorting(arr);

        System.out.print("Sorted array: ");       
        printArray(arr);
    }

    public void sorting(int arr[]) {
        int N = arr.length;

        for (int i = N / 2 - 1; i >= 0; i--)
            heap(arr, N, i);

        for (int i = N - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heap(arr, i, 0);
        }
    }

    void heap(int arr[], int N, int i) {
        int Max = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < N && arr[left] > arr[Max])
            Max = left;

        if (right < N && arr[right] > arr[Max])
            Max = right;

        if (Max != i) {
            int swap = arr[i];
            arr[i] = arr[Max];
            arr[Max] = swap;

            heap(arr, N, Max);
        }
    }

    static void printArray(int arr[]) {
        int N = arr.length;

        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
