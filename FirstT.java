import java.util.Scanner;

/**
 * FirstT
 */
// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// 1 + 2 + 3 1*2*3
public class FirstT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        int sum = 1;

        for (int i = 2; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("Треугольное число: " + sum);
        sum = 1;

        for (int i = 1; i <= num; i++) {
            sum = sum * i;
        }
        System.out.println("Факториал числа: " + sum);
    }
}