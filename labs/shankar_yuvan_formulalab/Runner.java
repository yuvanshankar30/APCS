import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Formulas formulas = new Formulas();

        // Keeps showing the menu until the user picks the number 0 so they can quit
        boolean running = true;
        while (running) {
            System.out.println("Formula Calculator");
            
            System.out.println("0. Quit");
            
            System.out.println("1. Area of a Triangle");
            
            System.out.println("2. Area of a Square");
            
            System.out.println("3. Area of a Rectangle");
            
            System.out.println("4. Area of a Circle");
            
            System.out.println("5. Circumference of a Circle");
            
            System.out.println("6. Hypotenuse of a Right Triangle");
            
            System.out.println("7. Law of Cosines");
            
            System.out.println("8. Law of Sines");
            
            System.out.println("9. Quadratic Formula");
            
            System.out.println("10. Distance Between Two Points");
            
            System.out.println("11. Speed");
            
            System.out.println("12. Weight Force");
            
            System.out.println("13. Momentum");
            
            System.out.println("14. Free Fall Velocity");
            
            System.out.println("15. Force");
            
            System.out.print("Choose a formula (0-15): ");
            int choice = scanner.nextInt();

            // Choice 0 ends the loop.
            if (choice == 0) {
                running = false;
                System.out.println("Goodbye!");
            } 
            else if (choice == 1) {
                System.out.println("Area of a Triangle");
                System.out.print("Enter the base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height: ");
                double height = scanner.nextDouble();
                formulas.areaOfTriangle(base, height);
            } 
            else if (choice == 2) {
                System.out.println("Area of a Square");
                System.out.print("Enter the side length: ");
                double side = scanner.nextDouble();
                formulas.areaOfSquare(side);
            } 
            else if (choice == 3) {
                System.out.println("Area of a Rectangle");
                System.out.print("Enter the length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width: ");
                double width = scanner.nextDouble();
                formulas.areaOfRectangle(length, width);
            } 
            else if (choice == 4) {
                System.out.println("Area of a Circle");
                System.out.print("Enter the radius: ");
                double radius = scanner.nextDouble();
                formulas.areaOfCircle(radius);
            } 
            else if (choice == 5) {
                System.out.println("Circumference of a Circle");
                System.out.print("Enter the radius: ");
                double radius = scanner.nextDouble();
                formulas.circumferenceOfCircle(radius);
            } 
            
            else if (choice == 6) {
                System.out.println("Hypotenuse of a Right Triangle");
                System.out.print("Enter leg 1: ");
                double leg1 = scanner.nextDouble();
                System.out.print("Enter leg 2: ");
                double leg2 = scanner.nextDouble();
                formulas.hypotenuse(leg1, leg2);
            } 
            
            // Angle is entered in degrees, not radians.
            else if (choice == 7) {
                System.out.println("Law of Cosines");
                System.out.print("Enter side A: ");
                double sideA = scanner.nextDouble();
                System.out.print("Enter side B: ");
                double sideB = scanner.nextDouble();
                System.out.print("Enter the included angle C in degrees: ");
                double angleC = scanner.nextDouble();
                formulas.lawOfCosines(sideA, sideB, angleC);
            } 
            
            else if (choice == 8) {
                System.out.println("Law of Sines");
                System.out.print("Enter side A: ");
                double sideA = scanner.nextDouble();
                System.out.print("Enter angle A in degrees (opposite side A): ");
                double angleA = scanner.nextDouble();
                System.out.print("Enter angle B in degrees: ");
                double angleB = scanner.nextDouble();
                formulas.lawOfSines(sideA, angleA, angleB);
            }
             else if (choice == 9) {
                System.out.println("Quadratic Formula");
                System.out.print("Enter a: ");
                double a = scanner.nextDouble();
                System.out.print("Enter b: ");
                double b = scanner.nextDouble();
                System.out.print("Enter c: ");
                double c = scanner.nextDouble();
                formulas.quadraticFormula(a, b, c);
            } 
            
            else if (choice == 10) {
                System.out.println("Distance Between Two Points");
                System.out.print("Enter x1: ");
                double x1 = scanner.nextDouble();
                System.out.print("Enter y1: ");
                double y1 = scanner.nextDouble();
                System.out.print("Enter x2: ");
                double x2 = scanner.nextDouble();
                System.out.print("Enter y2: ");
                double y2 = scanner.nextDouble();
                formulas.distanceBetweenPoints(x1, y1, x2, y2);
            } 
            
            else if (choice == 11) {
                System.out.println("Speed");
                System.out.print("Enter the distance in meters: ");
                double distance = scanner.nextDouble();
                System.out.print("Enter the time in seconds: ");
                double time = scanner.nextDouble();
                formulas.speed(distance, time);
            } 
            else if (choice == 12) {
                System.out.println("Weight Force");
                System.out.print("Enter the mass in kg: ");
                double mass = scanner.nextDouble();
                formulas.weightForce(mass);
            } 
            else if (choice == 13) {
                System.out.println("Momentum");
                System.out.print("Enter the mass in kg: ");
                double mass = scanner.nextDouble();
                System.out.print("Enter the velocity in m/s: ");
                double velocity = scanner.nextDouble();
                formulas.momentum(mass, velocity);
            } 
            else if (choice == 14) {
                System.out.println("Free Fall Velocity");
                System.out.print("Enter the time in seconds: ");
                double time = scanner.nextDouble();
                formulas.freeFallVelocity(time);
            } 
            
            else if (choice == 15) {
                System.out.println("Force");
                System.out.print("Enter the mass in kg: ");
                double mass = scanner.nextDouble();
                System.out.print("Enter the acceleration in m/s^2: ");
                double acceleration = scanner.nextDouble();
                formulas.force(mass, acceleration);
            } 
            // Catches any number outside 0-15.
            else {
                System.out.println("Invalid choice.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
