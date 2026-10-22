// Creates Rectangle and Triangle objects and prints each of their areas
public class Runner{

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        rec1.printArea();
        Rectangle rec2 = new Rectangle(5,3);
        rec2.printArea();
        Triangle triangle1 = new Triangle();
        triangle1.printArea();
        Triangle triangle2 = new Triangle(5,3);
        triangle2.printArea();
        //All object insantiations and calling methods for triangle objects

        
    }
}