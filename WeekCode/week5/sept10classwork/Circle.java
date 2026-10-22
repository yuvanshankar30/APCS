import java.util.Scanner;
//circle class and method

public class Circle {
    private double pi = 3.14;
    private double radius = 0;

    public void setRadius(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = input.nextDouble();
    }
    public void printArea(){
        double area = radius * radius * pi;
        System.out.println("The area is " + area);
    }


}
