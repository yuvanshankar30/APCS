import java.util.Scanner;

public class Runner {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        MathTest obj = new MathTest();

        /* asking the user for input for integers for numerator and denominator for the first function
        and the points for the second function.
        
        */

        System.out.print("What is the numerator (provide an integer): ");

        int numerator = sc.nextInt();

        System.out.print("What is the denominator (provide an integer): ");

        int denominator = sc.nextInt();

        obj.divide(numerator, denominator);

        
        System.out.print("What is y1?: ");
        int x3 = sc.nextInt();
        System.out.print("What is y2?: ");
        int x4 = sc.nextInt();
        System.out.print("What is x1?: ");
        int x1 = sc.nextInt();
        System.out.print("What is x2?: ");
        int x2 = sc.nextInt();
        

        obj.slope(x1, x2, x3, x4);




    }
    
}
