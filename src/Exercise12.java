public class Exercise12 {

    public static void main(String args[]){

        System.out.println("Fibonacci sequence:");

        int n1=0,n2=1,n3,x,count=10;

        System.out.print(n1+" "+n2);

        for(x=2;x<count;++x){

            n3=n1+n2;

            System.out.print(" "+n3);

            n1=n2;
            n2=n3;
        }

    }

}
