import java.util.Scanner;

//calculate area of circle

public class GoodForm{
public static void main(String args[]){
    Scanner keyboard = new Scanner(System.in);
    System.out.print("I will calculate the area of a circle. Please provide a radius: ");
    double cat =keyboard.nextDouble();
    double cow = 3.14; 
    double dog = cow * cat * cat;
    System.out.println("The area of this circle is " + dog); 

    // the "badform" code will compile, however it is messy and practically unreadable 
    // to the user
    
    
    }
}