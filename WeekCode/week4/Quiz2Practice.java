import java.util.Scanner;

public class Quiz2Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double length;
    
        double width;

        double area;

        double perimeter;

     String choice;

        System.out.print("What is the length: ");

        length = sc.nextDouble();


        System.out.print("What is the width: ");

        width = sc.nextDouble();

        System.out.print("Would you like to calculate area or perimeter: ");

        sc.nextLine();

        choice = sc.nextLine();

     perimeter = (length + width)*2;
        area = length * width;

        if (choice.equalsIgnoreCase("area")){
            

            System.out.println("The area is: " + area);



        }else if (choice.equalsIgnoreCase("perimeter")){
            
            System.out.println("The perimeter is " + perimeter);
        }else{
            System.out.println("Invalid option");
        }
        
    }
}
