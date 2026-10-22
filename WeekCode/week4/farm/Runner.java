public class Runner{
	public static void main(String[] args){
		//(1) Where is Chicken coming from?
		Chicken chicken = new Chicken();
        Cat cat = new Cat();
        Dog dog = new Dog();
		
		//(2) What is the significance of the variable chicken?
		//(3) Where is speak() coming from and what does it do?
		chicken.speak();
		chicken.speak();
		chicken.speak(); 
        dog.speak();
        dog.sayName();
        dog.sayBreed();
        cat.speak();
        cat.sayName();
        cat.sayType();
                  
 	}
 	
}
