public class VarQuizB{

    //quiz code to print the area and perimeter of a rectangle given that it has a length of 4.52 units and width of 9 units

    public static void main(String[] args) {

        //variable declaration and assignments for width and length

        int width;
        double length;
        width = 9;
        length = 4.52;

        System.out.println("width: " + width + "\nlength: " + length );

        double area;
        area = width * length;
        System.out.println("The area is " + area + ".");
        //printed . at the end so it is a complete sentence

        double perimeter;

        perimeter = 2*(width+length);

        System.out.println("The perimeter is " + perimeter + ".");
    }
}