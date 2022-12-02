import java.util.Arrays;

public class task31 {
    public static void main(String[] args) {
        int[] massive = {15, 5, 1, 7, 6, 3};
        PrintMassive(massive);
        SortUnsorted(massive, 0, massive.length - 1);
        PrintMassive(massive);
    }
    public static void SortUnsorted(int[] mas, int first_position, int last_position) {

        if (last_position <= first_position)
            return;
        int mid = first_position + (last_position - first_position) / 2;
        SortUnsorted(mas, first_position, mid);
        SortUnsorted(mas, mid + 1, last_position);
    
        int[] buf = Arrays.copyOf(mas, mas.length);
    
        for (int k = first_position; k <= last_position; k++)
            buf[k] = mas[k];
    
        int i = first_position, j = mid + 1;
        for (int k = first_position; k <= last_position; k++) {
    
            if (i > mid) {
                mas[k] = buf[j];
                j++;
            } else if (j > last_position) {
                mas[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                mas[k] = buf[j];
                j++;
            } else {
                mas[k] = buf[i];
                i++;
            }
        }
    }
    public static void PrintMassive(int[] m){
    for(int i = 0; i < m.length; i++){
        System.out.print(m[i] + ",");
    }
    System.out.println();
    }
}
