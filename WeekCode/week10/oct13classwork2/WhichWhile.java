import java.util.Scanner;
public class WhichWhile {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        
        int storednum = sc.nextInt();

        while (storednum <= 5){
            System.out.print("Input a number: ");
            storednum = sc.nextInt();
        }
        System.out.println("The number is: " + storednum);


        


    }
    
}
