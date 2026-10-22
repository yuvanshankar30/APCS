// this code has one method per formula, each printing its own result for the specified input.
//Scanner that asks the user for the specific variables passed into the methods is in the Runner.java file
public class Formulas {

    private double pi = 3.14; // used by circle and sphere formulas
    private double gravity = 9.8; // used by the physics formulas

    // half base times height
    public void areaOfTriangle(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is " + area + ".");
    }

    // side squared
    public void areaOfSquare(double side) {
        double area = side * side;
        System.out.println("The area of the square is " + area + ".");
    }

    // length times width
    public void areaOfRectangle(double length, double width) {
        double area = length * width;
        System.out.println("The area of the rectangle is " + area + ".");
    }

    // pi * r squared
    public void areaOfCircle(double radius) {
        double area = pi * radius * radius;
        System.out.println("The area of the circle is " + area + ".");
    }

    // 2 * pi * r
    public void circumferenceOfCircle(double radius) {
        double circumference = 2 * pi * radius;
        System.out.println("The circumference of the circle is " + circumference + ".");
    }

    // pythagorean theorem
    public void hypotenuse(double leg1, double leg2) {
        double hyp = Math.sqrt(leg1 * leg1 + leg2 * leg2);
        System.out.println("The hypotenuse of the triangle is " + hyp + ".");
    }

    // Solves for the third side of a triangle given two sides and  angle
    public void lawOfCosines(double sideA, double sideB, double angleC) {
        double angleRadians = Math.toRadians(angleC);
        double sideC = Math.sqrt(sideA * sideA + sideB * sideB - 2 * sideA * sideB * Math.cos(angleRadians));
        System.out.println("The third side of the triangle is " + sideC + ".");
    }

    // Solves for a missing side using a given side and two angles
    public void lawOfSines(double sideA, double angleA, double angleB) {
        double angleARadians = Math.toRadians(angleA);
        double angleBRadians = Math.toRadians(angleB);
        if (Math.sin(angleARadians) == 0) {
            System.out.println("Angle A cannot be 0 or 180 degrees.");
            return;
        }
        double sideB = (sideA * Math.sin(angleBRadians)) / Math.sin(angleARadians);
        System.out.println("The missing side of the triangle is " + sideB + ".");
    }

// Uses the quadratic formula to find both roots of the polynomial
public void quadraticFormula(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("The solutions are x = " + root1 + " and x = " + root2 + ".");
    }
// distance formula between two points
public void distanceBetweenPoints(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the two points is " + distance + ".");
    }
// distance over time
public void speed(double distance, double time) {
        double speed = distance / time;
        System.out.println("The speed of the object is " + speed + " meters per second.");
    }
public void weightForce(double mass) {
        double weight = mass * gravity;
        System.out.println("The weight of the object is " + weight + " newtons.");
    }

    // mass times velocity
    public void momentum(double mass, double velocity) {
        double momentum = mass * velocity;
        System.out.println("The momentum of the object is " + momentum + " kg*m/s.");
    }

    // gravity times time
    public void freeFallVelocity(double time) {
        double velocity = gravity * time;
        System.out.println("The velocity of the object is " + velocity + " meters per second.");
    }

    // mass times acceleration
    public void force(double mass, double acceleration) {
        double force = mass * acceleration;
        System.out.println("The force on the object is " + force + " newtons.");
    }
}
