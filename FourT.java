// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// Под знаком вопроса - одинаковые цифры
// Введите уравнение: ?? + ?? = 44
// Ответ: 22 + 22 = 44

import java.util.Scanner;

public class FourT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите уравнение вида q + w = e: ");
        String equation = sc.nextLine();
        
        int countSym = 0;
        for (int i = 0; i < equation.length(); i++) {
            if (equation.charAt(i) == '?') {
                countSym++;
            }
        }

        String[] values = equation.split(" ");

        String num1 = values[0];
        String num2 = values[2];
        String res = values[4];

        System.out.println(countSym);
        System.out.println(num1 +"+"+num2+"="+res);
        sc.close();
    }
}
