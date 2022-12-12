import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Notebook Acer = new Notebook("Acer", 2, 500, "Win7", "black");
        Notebook HP = new Notebook("HP", 8, 1000, "Win10", "Dark blue");
        Notebook Lenovo = new Notebook("Lenovo", 4, 500, "Win8.1", "black");
        Notebook MSI = new Notebook("MSI", 16, 2000, "Win10", "RGB");
        Notebook Dell = new Notebook("Dell", 8, 1000, "Win11", "White");

        HashSet<Notebook> Catalog = new HashSet<>(Arrays.asList(Acer,HP,Lenovo, MSI, Dell));

        for(Notebook all:Catalog)
        {
            all.PrintInfo();
        }

        Scanner iScanner = new Scanner(System.in);
        while(true){
            System.out.println("По какому параметру фильтруем?");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.println("0 - Закрыть");
            Integer digit = iScanner.nextInt();
            if (digit != 0){
                System.out.println();
                Filter(Catalog,digit);
                System.out.println();
            }
            else 
            iScanner.close();
        }

    }
    public static void Filter(HashSet<Notebook> HS, Integer param){
        switch (param) {
            case 1:
            for(Notebook all:HS)
            {
                System.out.println(all.Mark + " || " + all.RAM);
            }
                break;
            case 2:
            for(Notebook all:HS)
            {
                System.out.println(all.Mark + " || " + all.Memory);
            }
                break;
            case 3:
            for(Notebook all:HS)
            {
                System.out.println(all.Mark + " || " + all.OS);
            }
                break;
            case 4:
            for(Notebook all:HS)
            {
                System.out.println(all.Mark + " || " + all.Color);
            }
                break;            
            default:
                break;
        }
        
    }
}
