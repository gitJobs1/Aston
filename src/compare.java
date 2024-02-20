import java.util.Scanner;

public class compare {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)){
            System.out.println("Строки идентичны");
        }else {
            System.out.println("Строки неидентичны");
        }
    }
}
