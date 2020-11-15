import java.util.Scanner;

public class Exercise13 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        System.out.println("Digite un número: ");

        int x,factorial=1;
        int number= scanner.nextInt();

        for(x=1;x<=number;x++){

            factorial=factorial*x;
        }

        System.out.println(factorial);
    }
}
