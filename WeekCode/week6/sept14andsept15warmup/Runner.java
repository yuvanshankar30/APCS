import java.util.Scanner;

// Reads animal type and age from user input, then prints info for two animals
public class Runner {

    public static void main(String[] args) {
        String type;
        int age;
        Scanner scanner = new Scanner(System.in);
        Animal aObj1 = new Animal();
        Animal aObj2 = new Animal();
        System.out.print("What is the type of animal? ");
        type = scanner.nextLine();
        System.out.print("What is the animal's age? ");
        age = scanner.nextInt();
        aObj1.setVariables(type, age);
        aObj1.printInfo();
        aObj2.setVariables("Horse", 7);
        aObj2.printInfo();
        scanner.close();
    //code for the runner that calls methods on the animal class}
}
}
