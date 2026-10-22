public class Radius {
    //radius class with methods that prints area, circumference and volume of a specifc radius(parameter)

    private double pi = 3.14;
    
    
    // Calculates the area of a circle from the given radius
    public void printArea(double radius){
        double area = pi * Math.pow(radius,2);
        System.out.println("Area: " + area);
    }
    // Calculates the circumference of a circle from the given radius
    public void printCir(double radius){
        double circumference = 2 * pi * radius;
        System.out.println("Circumference: " + circumference);
    }
    // Calculates the volume of a cone from the given radius and height
    public void printConeVol(double radius,double height){
        double volume = (1.0/3)* pi * height * Math.pow(radius,3);
        System.out.println("Cone Volume: " + volume);
    }
    
}
