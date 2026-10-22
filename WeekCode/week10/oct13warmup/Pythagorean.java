public class Pythagorean {
    private double a;
    private double b;
    private double c;

    Pythagorean(){
        //Default Contructor

    }

    public double findC(double a, double b){

        //a^2 + b^2 = C^2
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
        //Calculates for c variable in the pythagorean theorem
        


        return c;

    }
    
}
