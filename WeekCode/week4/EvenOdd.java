
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;

        System.out.print("Input an integer: ");

        input = scanner.nextInt();

        if (input % 2 ==0){
            System.out.println(input + " is even");
        }else{
            System.out.println(input + " is odd");
        }
        
        
    }
    
}
