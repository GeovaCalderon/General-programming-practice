public class Exercise5 {

    public static void main(String[] args) {

        int[] numbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int position=0; position<numbers.length; position++){

            if (numbers[position]%5==0 && numbers[position]<=150){
                System.out.println(numbers[position]);
            }
        }


    }
}
