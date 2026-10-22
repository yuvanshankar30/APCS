// Represents a rectangle with a length and width and can print its area
public class Rectangle{
    private int length, width;

    // Default constructor that sets length and width to zero
    public Rectangle(){
        length = 0;
        width = 0;

    }
    // Constructor that sets length and width from the given parameters
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    // Calculates and prints the rectangle's area
    public void printArea(){
        int area = length * width;
        System.out.println("Area is " + area);
    }


    
}