import java.lang.Math;

public class Exercise11 {

    public static void main(String[] args) {

        int start = 25;
        int end = 50;
        int number;

        System.out.println("Los numeros primos entre "+ start + " y "+ end + " son:");

        for (number=start;number <= end; number++){

            int firstVariable = 2;
            double squareRootFormNumber = Math.sqrt(number);
            int counter = 0;


            while (firstVariable <= squareRootFormNumber) {
                if (number % firstVariable == 0) {
                    counter++;
                }
                firstVariable++;
            }

            if (counter == 0) {
                System.out.println(number);
            }
        }

    }

}
