// 2) Вывести все простые числа от 1 до 1000
public class SecondT {
    public static void main(String[] args) {

        for (int i = 2; i < 1000; i++) {
            Boolean simpleNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simpleNumber = false;
                    break;
                }
            }
            if (simpleNumber) {
                System.out.println(i);
            }
        }
    }
}
