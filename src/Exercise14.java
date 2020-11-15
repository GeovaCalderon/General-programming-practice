public class Exercise14 {

    public static void main(String[] args) {

        int number = 76542, newNumber = 0;

        while(number != 0){

            int remainder = number % 10;

            newNumber = newNumber * 10 + remainder;
            number = number/10;
        }

        System.out.println("The reverse of "+ number + " is: " + newNumber);
    }
}
