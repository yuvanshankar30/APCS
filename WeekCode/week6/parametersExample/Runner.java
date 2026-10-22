// Creates a PTest object and calls its methods to test parameter passing
public class Runner{
	public static void main(String[] args){
	   PTest testObj = new PTest();
	   
	   //(1) Describe what is happening with the two lines of code below.
	   testObj.times(5, 7);
	   System.out.println();

       //calling the times method with parameters 5 and 7 on the testObj Object, making it multiply 5 and 7
       
	   
	   //(2)  Describe what is happening with the two lines of code below.
	   testObj.divide(3, 2);
	   System.out.println();
	   //dividing the doubles 3 and 2. calling the divide method with parameters double 3 and double 2, causing the answer tpo be 1.5
	   //(3) Describe what is happening with the line of code below.
	   testObj.sayHello("Mrs. Winawer");
       //printing the parameter


	}
}
