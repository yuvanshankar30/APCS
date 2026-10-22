public class Animal {
    private String animalType;
    private int animalAge;

    // Sets the animal's type and age instance variables from the parameters
    public void setVariables(String type, int age){
        animalType  = type;
        animalAge = age;

    }
    // Prints the animal's current type and age
    public void printInfo(){
        System.out.println("Animal type is " + animalType + " age is " + animalAge);

    }
    //code for the animal object, methods and instance variables
}
