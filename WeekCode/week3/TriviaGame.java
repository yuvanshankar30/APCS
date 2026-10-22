import java.util.Scanner;
//trivia
public class TriviaGame {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // 6 questions

        System.out.print("What is the best color: ");
        String Answer1 = "blue";
        String useranswer1 = scanner.next();
        scanner.nextLine();

        if (Answer1.equals(useranswer1)){

            score += 1;

            System.out.println("correct");


        }else{
            System.out.println("That is wrong");
        }
        
        
        System.out.print("Who was the first US president? ");
        String Answer2 = "George Washington";
        String useranswer2 = scanner.nextLine();
        if (Answer2.equals(useranswer2)){

            score += 1;

            System.out.println("correct");


        }else{
            System.out.println("That is wrong");
        }
        

        
        System.out.print("Are arya and raymonds both chuds? ");
        String Answer3 = "yes";
        String useranswer3 = scanner.next();
        scanner.nextLine();
        if (Answer3.equals(useranswer3)){

            score += 1;

            System.out.println("correct");


        }else{
            System.out.println("That is wrong");
        }
        


        System.out.print("what color is grass when its fresh and when its not fresh? ");
        String Answer4 = "green and brown";
        String useranswer4 = scanner.nextLine();
        if (Answer4.equals(useranswer4)){

            score += 1;

            System.out.println("correct");


        }else{
            System.out.println("That is wrong");
        }
        

        
        System.out.print("Which planet is closest to the sun: ");
        String Answer5 = "mercury";
        String useranswer5 = scanner.next();
        scanner.nextLine();
        if (Answer5.equals(useranswer5)){

            score += 1;

            System.out.println("correct");


        }else{
            System.out.println("That is wrong");
        }
        

        
        System.out.print("what colors are raymond's shirt ");
        String Answer6 = "gray and blue";
        String useranswer6 = scanner.nextLine();
        if (Answer6.equals(useranswer6)){

            score += 1;

            System.out.println("correct");


        }else{
            System.out.println("That is wrong");
        }
        System.out.println("Your Score: " + score);



        
    }
    
}
