eimport java.util.Scanner;

public class BooLean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int points = 20;

        while (true) {
            // pick two random numbers from 1 to 10
            int num1 = (int)(Math.random() * 10 + 1);
            int num2 = (int)(Math.random() * 10 + 1);
            System.out.println(num1 + " " + num2);

            if (num1 == 5 && num2 == 5) {
                System.out.println("you win 10 points");
                points += 10;
            } else if (num1 == num2) {
                System.out.println("you win 3 points");
                points += 3;
            } else if (num1 % 2 == 0 || num2 % 2 == 0) {
                System.out.println("you win 2 points");
                points += 2;
            } else if (num1 > 3 || num2 > 3) {
                System.out.println("you win 1 point");
                points += 1;
            } else {
                System.out.println("you lose 1 point");
                points -= 1;
            }
            System.out.println("Points: " + points);

            // stop the game if the user doesn't type y
            System.out.println("Play again? (y/n)");
            if (!input.nextLine().equals("y")) {
                break;
            }
        }
    }
}
