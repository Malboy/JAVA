import java.util.ArrayList;
import java.util.Random;

public class task33 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            list.add(rand.nextInt(20));
        }
        System.out.println(list);
        int min = list.get(0);
        int max = list.get(0);
        for (int i = 1; i <list.size(); i++){
            if (list.get(i)> max){
                max = list.get(i);
            }
            if (list.get(i)< min){
                min = list.get(i);
            }
        }
        int mid = (max + min) / 2;
        System.out.println("max = " + max + "\n" + "min = " + min + "\n" + "middle = " + mid);  
    }
}
