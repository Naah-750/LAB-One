import java.util.Scanner;
public class lab_one_Q5 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int x = 1000;
            System.out.println("Input Years");
            int a = input.nextInt() ;
            for(int i  = 1 ; i <= a ; i ++  )
                x = x + 50  ;
            System.out.println("Your money after(" + a + ")years =$" + x +"\n" ) ;
            System.out.println("thank u");
        }
    }

