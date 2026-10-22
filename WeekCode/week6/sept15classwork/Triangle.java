// Represents a triangle with a base and height and can print its area
public class Triangle{

    private int base;
    private int height;

    // Default constructor that sets base and height to zero
    public Triangle(){
        base = 0;
        height = 0;
    }
    // Constructor that sets base and height from the given parameters
    public Triangle(int base, int height){
        this.base = base;
        this.height = height;

    }
    // Calculates and prints the triangle's area
    public void printArea(){
        double area = (base * height) / 2.0;
        System.out.println("Area is " + area);
    }




}