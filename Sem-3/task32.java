import java.util.ArrayList;
import java.util.Random;

public class task32 {
    public static void main(String[] args) {
        ArrayList<Integer> spisok = new ArrayList<Integer>();
        Random rand = new Random();
        int len = 10;
        for(int i = 0; i < len;i++){
            spisok.add(rand.nextInt(20));
        }
        System.out.println(spisok);
         StringBuilder WithoutEven = new StringBuilder();
        for (int i = 0; i < spisok.size(); i++){
            if (spisok.get(i) % 2 != 0){
                WithoutEven.append(spisok.get(i) + ", ");
            }
        }
            System.out.print("[" + WithoutEven + "]");
    }
}
