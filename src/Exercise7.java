public class Exercise7 {

    public static void main(String[] args){

        int z=5, x, y;

        for (x = z; x >= 1; x--){

            for (y = x; y >= 1; y--) {

                System.out.print(y+" ");
            }

            System.out.println();
        }
    }
}
