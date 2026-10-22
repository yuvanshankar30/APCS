import java.util.Scanner;
public class Runner {

    public static void main(String[] args) {
        //while loop that adds up all numbers between 2 and 19 inclusive (should be 189)
        int count = 2;
        int sum = 0; 

        while (count <= 19) {
        sum += count; 
        count++;     
        }
        System.out.println(sum);

        count = 1;
        sum = 0;
        
        do{
            count ++;
            sum += count;


        }while(count < 19);
        System.out.println(sum);

        Scanner sc = new Scanner(System.in);

        
        
        System.out.print("Provide a positive number: ");
        int input = sc.nextInt();
        //checks whether the input is less than or is zero, and if that is true, it rejects the input
        //and reprompts the user.
        while (input <= 0) {
        System.out.print("That's not a number. Provide a positive number: ");
        input = sc.nextInt(); 
        }
        
        int startnum = 0;


        do {
            startnum ++;
            System.out.print(startnum + " ");


        }while(startnum < input);

        System.out.println();
        startnum = input;
        do{
            System.out.print(startnum + " ");
            startnum--;
        }while(startnum >= 1);

        System.out.println();

        

        
        
    }
    
}
