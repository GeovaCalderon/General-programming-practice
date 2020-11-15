import java.util.Scanner;

public class Exercise6 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite un número: ");

        int number = scanner.nextInt();
        int counter = 0;

        while (number != 0){

            number = number/10;
            counter++;

        }

        System.out.println(counter);
    }
}
