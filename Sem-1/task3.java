import java.util.Scanner;

public class task3 {
public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
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
            break;
        case "-":
            result = digit1 - digit2;
            System.out.println(digit1 + " - " + digit2 + " = " + result );
            break;
        case "*":
            result = digit1 * digit2;
            System.out.println(digit1 + " * " + digit2 + " = " + result );
            break;
        case "/":
            result = digit1 / digit2;
            System.out.println(digit1 + " / " + digit2 + " = " + result );
            break;
    
        default:
            break;
    }
    iScanner.close();
    
}
}