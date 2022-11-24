import java.util.ArrayList;


public class task2 {
public static void main(String[] args) {
    int max_digit = 1000;
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 2; i < max_digit + 1; i++ ){
        int count = 0;
        for (int j = 1; j < i + 1; j++){
            if (i % j == 0){
                count++;
            }   
        }
        if (count == 2){
            list.add(i);
        }
    }
    System.out.println(list);
}
    
}