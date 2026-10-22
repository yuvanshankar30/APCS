public class Runner{
	public static void main(String[] args){
		// 1. What do the first two lines do? Be specific!
		Overloaded p1 = new Overloaded();
		Overloaded p2 = new Overloaded(16, "John");

        //In these lines, there are 2 instantiations of object Overloaded, 
        //But they have different constructors
        //The compiler knows what contructor they are referring to because
        //Of the parameters passed in
		
		// 2. Explain each of the following print lines. Be specific about how the output is calculated.
		p1.print();
		p2.print();
		System.out.println();
        /*
        p1.print() uses the default constructor, because that is how the object was instantiated.
        This means that its name was set to "blank" and age was set to 0. So, It will print: The name is blank and the age is 0
        P2.print() on the other hand has actual parameters passed in through the constructor, and those are set to its instance variables
        so, P2.print will print The name is John and the age is 16
        */
		
	        // 3. Explain what update does
		p1.update("Ralph", 25);
		System.out.println();

        //Update sets a new name and age to the object by changing the instance variables
		
		
                // 4. Explain what the calls to update do
		p2.update(5);
                System.out.println();
        //Update the age to 5 years old


		p2.update("Henry");
        //Update name to Henry


                // 5. How does the compiler know which update to call?
                //It knows what update to call, because each method has unique parameters.
	}
}
