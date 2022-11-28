import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class task2_4 {
public static void main(String[] args) {

    Logger loger = Logger.getLogger(task2_2.class.getName());
    ConsoleHandler info = new ConsoleHandler();
    loger.addHandler(info);
    
    Scanner iScanner = new Scanner(System.in);
    boolean count = true;
    while(count)
    {
        System.out.print("Введите первое число число: ");
        float digit1 = iScanner.nextInt();
        System.out.print("Введите второе число число: ");
        float digit2 = iScanner.nextInt();
        System.out.print("Введите выполняемую операцию: ");
        String operator = iScanner.next();
        float result = 0.0f;
        switch (operator) {
            case "+":
                result = digit1 + digit2;
                System.out.println(digit1 + " + " + digit2 + " = " + result );
                loger.info(Float.toString(digit1) + " + " + Float.toString(digit2) + " = " + Float.toString(result) );
                break;
            case "-":
                result = digit1 - digit2;
                System.out.println(digit1 + " - " + digit2 + " = " + result );
                loger.info(Float.toString(digit1) + " - " + Float.toString(digit2) + " = " + Float.toString(result) );
                break;
            case "*":
                result = digit1 * digit2;
                System.out.println(digit1 + " * " + digit2 + " = " + result );
                loger.info(Float.toString(digit1) + " * " + Float.toString(digit2) + " = " + Float.toString(result) );
                break;
            case "/":
                result = digit1 / digit2;
                System.out.println(digit1 + " / " + digit2 + " = " + result );
                loger.info(Float.toString(digit1) + " / " + Float.toString(digit2) + " = " + Float.toString(result) );
                break;
        
            default:
                break;
        }
        System.out.println("Считаем ещё ? y/n?");
        String answer = iScanner.next();

        
        switch (answer)
        {
            case "n":
                count = false;
                break;
            case "y":
                count = true;
                break;

            default:
                break;
        }     
    }
    iScanner.close();
}
}