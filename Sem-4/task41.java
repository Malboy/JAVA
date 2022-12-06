import java.util.LinkedList;

public class task41 {
    public static void main(String[] args) {

        int[] listMas = {1,2,3,4,5,6,7,8,9,10};
        LinkedList<Integer> LL = new LinkedList<>();

        for (Integer temp : listMas) {
            LL.add(temp);
        }
        
        int temp = 0;
        while (temp != LL.size() - 1) {
            LL.add(LL.size()-temp, LL.getFirst());
            LL.removeFirst();
            temp++;
        }


        System.out.println("linkList = " + LL);

        
    }
}
