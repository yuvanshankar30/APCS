import java.util.Scanner;


public class MathLibrary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int radius;
        int height;
        int a;
        int b;
        int c;

        System.out.println("Calculating volume of a cylinder");

        System.out.print("Give a radius: ");
        
        radius = scanner.nextInt();

        System.out.print("Give a height: ");

        height = scanner.nextInt();

        double volume = Math.PI * Math.pow(radius, 2);

        System.out.println("The volume of this cylinder is " + volume);

        System.out.println("Solving the Quadratic Formula.");

        System.out.print("Give a: ");

        a = scanner.nextInt();

        System.out.print("Give b: ");

        b = scanner.nextInt();

        System.out.print("Give c: ");

        c = scanner.nextInt();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant < 0) {

            System.out.println("Number is not real");

        } else {

            double result1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double result2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("The results are " + result1 + " and " + result2);

        }


        System.out.println("Solving the Pythagorean Theorem.");

        System.out.print("Give a: ");

        a = scanner.nextInt();

        System.out.print("Give b: ");

        b = scanner.nextInt();

        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The value of c is " + hypotenuse);

    }
}
