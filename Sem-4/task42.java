import java.util.LinkedList;

public class task42 {
    public static void main(String[] args) {
        int[] spisok = { 1, 3, 2, 6, 4, 5 };

        LinkedList<Integer> LL = new LinkedList<>();
        for (Integer i : spisok) {
            LL.add(i);
        }

        System.out.println(LL);

        enqueue(LL, 7);
        System.out.println(LL);

        System.out.println(dequeue(LL));
        System.out.println(LL);

        System.out.println(first(LL));
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}
