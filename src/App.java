import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("введите первое значение");
            int a = scanner.nextInt();
            System.out.println("введите второе значение");
            int b = scanner.nextInt();
            System.out.println("введите арифметические операции");
            char operation = scanner.next().charAt(0);
            switch (operation) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a + b);
                    break;
                default:
                    System.out.println("Введенные данные не ссостветсвует к требованиес");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
