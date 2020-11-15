import java.util.Scanner;

public class Exercise4 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite un número: ");

        double number = scanner.nextDouble();

        double multi = 0;

        for (multi=1; multi<=10; multi++){

            System.out.println(number * multi);

        }


    }
}
