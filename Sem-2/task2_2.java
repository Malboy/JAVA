import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class task2_2 {
    public static void main(String[] args) throws SecurityException, IOException {

        Logger loger = Logger.getLogger(task2_2.class.getName());
        FileHandler fh = new FileHandler("log.xml");
        //ConsoleHandler info = new ConsoleHandler();
        loger.addHandler(fh);

        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        int [] mass = {5, 7, 1, 6, 0, 8, 4};
        for(int i=0;i<mass.length;i++){
            System.out.print(mass[i] + " ");
        }
        System.out.println(); 
        for (int i = 0; i < mass.length; i++){
            for (int j = 0; j < mass.length - 1; j++){
                if (mass[j] > mass[j + 1])
                    {
                    int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                    }
                }
            System.out.println(i + "[" + Arrays.toString(mass) + "]");
            loger.info(i + "[" + Arrays.toString(mass) + "]");
        }
    }
}
