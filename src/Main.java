import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int a = scanner.nextInt();

        System.out.println("Введите второе целое число");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else if (a == b) {
            System.out.println(a + " = " + b);
        }

        System.out.println("Закончите сессию или введите команду для работы с цифрами:\n" +
                "1 - для сложения чисел\n" +
                "2 - для вычитания чисел\n" +
                "3 - для деления чисел\n" +
                "4 - для умножения чисел\n" +
                "5 - показать все варианты");


        System.out.println("введите команду");

        float num1 = a;
        float num2 = b;

        int calc = scanner.nextInt();
        if (calc == 1) {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (calc == 2) {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (calc == 3) {

            if (b == 0) {
                System.out.println("Делить на 0 нельзя");
            } else {
                System.out.println(a + " / " + b + " = " + (num1 / num2));
            }
        } else if (calc == 4) {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if(calc == 5) {
            System.out.println(a + " + " + b + " = " + (a + b));
            System.out.println(a + " - " + b + " = " + (a - b));

            if (b == 0) {
                System.out.println("Делить на 0 нельзя");
            } else {
                System.out.println(a + " / " + b + " = " + (num1 / num2));
            }

            System.out.println(a + " * " + b + " = " + (a * b));
        }else{
            System.out.println("Команда отсутствует");
        }
    }
}