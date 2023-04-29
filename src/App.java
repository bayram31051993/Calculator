import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = Integer.parseInt(scanner.next());
            if (a == 0) {
                System.out.println("Значение должно быть больше 0");
                return;
            }
            char operation = scanner.next().charAt(0);

            int b = Integer.parseInt(scanner.next());

            switch (operation) {
                case '+':
                    System.out.print("вывод: ");
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.print("вывод: ");
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.print("вывод: ");
                    System.out.println(a * b);
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("Делимое не должно быть 0");
                        return;
                    }
                    System.out.print("вывод: ");
                    System.out.println(a / b);

                    break;
                default:
                    System.out.println("Введенные данные не ссостветсвует к требованиес");
            }
        } catch (Exception e) {
            System.out.println(e
                    + ": т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

    }
}
