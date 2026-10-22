public class Runner {
    public static void main(String[] args){

        //instantiates obj as a object of the pyth class, then calls find c with the sides set to 12 and 5
        //then it prints the result
        
        Pythagorean obj1 = new Pythagorean();
        double result = obj1.findC(12,5);
        System.out.println(result);


    }

    
    
}
