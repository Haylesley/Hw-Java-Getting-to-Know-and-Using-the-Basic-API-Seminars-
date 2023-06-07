//3) Реализовать простой калькулятор (+-/*)
// sc.next() - считывает 1 элемент
// sc.nextInt() - считывает только число
// sc.nextLine() - считывает строчку

import java.util.Scanner;

public class ThreeT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = sc.nextDouble();

        System.out.print("Введите знак: ");
        char ch = sc.next().charAt(0);

        System.out.print("Введите второе число: ");
        double num2 = sc.nextDouble();

        double result = 0;

        switch(ch) {
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/': result = num1 / num2;
                break;
            default:  System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.println(num1 + " " + ch + " " + num2 + " = " + result);
        
        sc.close();
    }
}
