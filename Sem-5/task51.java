import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class task51 {
    public static void main(String[] args) {
        Map<Integer, ArrayList<String>> phoneBook = new HashMap<Integer, ArrayList<String>>();
        Map<Integer, String> nameBook = new HashMap<Integer, String>();
        nameBook.put(0, "Гаврилин С.А.");
        nameBook.put(1, "Вертухаев А.Д.");
        nameBook.put(2, "Амбалова Д.Ю.");
        nameBook.put(3, "Горева Д.К.");
        for (int i=0;i< nameBook.size();i++){
        if (phoneBook.get(i)==null){
            phoneBook.put(i, new ArrayList<String>()); 
            phoneBook.get(i).add("8-812-777-66-"+i+i/2+";"+"8-495-333-61-"+i+i);
        }
        System.out.println("Телефонные номера абонента "+nameBook.get(i)+": "+phoneBook.get(i));
        }
               
    }
}
