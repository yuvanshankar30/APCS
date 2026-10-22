import java.util.Scanner;
public class BuildSentence {

    public static void main(String[] args) {

        //asks user for noun and verb and prints a sentence
        
        Scanner sc = new Scanner(System.in);

        String verb;
        String noun;

        System.out.print("What is the noun?(singular): ");

        noun = sc.next();

        
        System.out.print("What is the Verb: ");

        verb = sc.next();

       String sentence = "The " + noun + " " + verb + "s.";

        System.out.println(sentence);

        sc.close();
    }
}
