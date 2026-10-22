

public class UseRadius {
    private double pi;
    private double radius;
    private double volume;
    private double area;

    public UseRadius(){
        radius = 0;
        pi = 3.14;
        volume = 0;
    }
    public UseRadius(double radius){
        this.radius = radius;
        pi = 3.14;
        volume = 0;

    }
    public void calcVol(){
        volume = (1.33 * Math.pow(radius, 3) * pi);
    }
    public void printVol(){
        calcVol();
        System.out.println("The volume is " + volume);
    }
    public void printArea(){
        area = pi * Math.pow(radius, 2);
        System.out.println("Area is " + area);

    }
    public void printArea(double radius){
        area = pi * Math.pow(radius, 2);
        System.out.println("Area is " + area);

    }
    public void printVol(double radius, double height){
        volume = height * pi * Math.pow(radius, 2);
        System.out.println("The volume is " + volume);
        

    }

    /*
    +printArea() : void method that calculates and prints the area of the circle.
    +printArea(double radius) : void method that expects a radius parameter. Calculate and print the area with radius that is passed in. 
    +printVol(double radius, double height) : You already have one printVol() method. Add this void method that expects a radius and height and calculates the volume of a cylinder (vol = pi* radius* radius * height).  This method does not call calcVol().

    
    */

}
