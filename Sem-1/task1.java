import java.util.Scanner;

public class task1 {
public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int digit = iScanner.nextInt();
    int traingledigit = ((digit + 1) * digit) / 2;
    System.out.println("треугольник числа " + digit + " равен: " + traingledigit);
    iScanner.close();
}
    
}