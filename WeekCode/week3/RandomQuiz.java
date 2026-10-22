import java.util.Scanner;
public class RandomQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        

        //code that does fahrenheit to celsius conversion and video game trivia

        System.out.println("1. Fahrenheit to Celsius Conversion");
        System.out.println("2. Video Game Trivia");
        System.out.print("Choose One: ");

        choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1){

            int userinput = 0;

            System.out.print("What is 32 Degrees Fahrenheit in Celsius: ");

            userinput = sc.nextInt();

            if (userinput == 0){

                System.out.println("Correct!");
            }else{

                System.out.println("That is incorrect");


            }
        }
        else if(choice == 2){
            

            System.out.print("What is the most popular Video Game Built on Java: ");
            String userinput = sc.nextLine();

            if (userinput.equalsIgnoreCase("minecraft")){
                System.out.println("Correct");
            }
            else{
                System.out.println("Incorrect");
            }
        }
        else{

            System.out.println("Invalid Value");
        }
    }
    
}
