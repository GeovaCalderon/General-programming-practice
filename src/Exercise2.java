public class Exercise2 {

    public static void main(String[] args) {

        int x,y,number, z= 5;

        for (x=0; x<z; x++){

            number = 1;

            for (y=0; y<=x; y++){

                System.out.print(number + " ");

                number++;
            }

            System.out.println();
        }
    }
}
