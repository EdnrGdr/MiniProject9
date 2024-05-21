import java.util.Scanner;

public class Main {

    public static void main (String [] args) {

        /*
İç içe for döngüsü kullanarak çarpım tablosu yapma
         */


        for ( int a = 1 ; a <= 10 ; a++  ) {
            System.out.println("*********************");

            for ( int b = 1; b <= 10; b ++) {

                System.out.println(a + " * " + b + " =" + (a*b));

            }
            System.out.println("*********************");

        }

        


    }
}
