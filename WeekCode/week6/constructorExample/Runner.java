public class Runner {
	// Creates several Animal objects using different constructors and prints their info



	public static void main(String args[]) {


                
		Animal animal1 = new Animal();
                //Comment: instantiating a object of class animal called animal 2 with the default constructor
		Animal animal2 = new Animal("cat", 7);
                //Comment:  instantiating a object of class animal called animal 2 with the parameters animalType: cat and animalAge:7
		Animal animal3 = new Animal("goat", 2);

        Animal animal4 = new Animal("human", "arya", 15);
		
                //Comment: Instantiating an object of class animal that is called animal3 with animal type set as goat and the age set to 2
		animal1.printInfo();


                //Comment: Printing the type, name and age of animal 1 (name is not applicable). It will not print anything
		animal2.setName("Roco");
		animal2.printInfo();


                //Comment: printing the type, name and age of animal 2. The name is roco, it is a cat and its age is 7
		animal3.setName("Fluffy");
		animal3.printInfo();
                //Comment: sets the name of animal 3 to fluffy. then it prints all of its properties, which its name (fluffy), type(goat) and age(2)
        animal4.printInfo();
	}
}
