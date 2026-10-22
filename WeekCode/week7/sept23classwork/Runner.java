

public class Runner {

    public static void main(String[] args){

        UseRadius r1 = new UseRadius();
        UseRadius r2 = new UseRadius(10.0);

        r1.printVol();
        r2.printVol();
        r1.printArea();
        r2.printArea();
        r1.printArea(5);
        r2.printArea(5);
        r2.printVol(7,10);

    }
    
    /*
Runner.java - add the following to your code.
Call printArea() and printArea(double) passing in 5 using r1.
Call printArea() and printArea(double) passing in 5 using r2.
Call printVol(double, double) using r2 passing in 7 for radius and 10 for height.
*/
}
