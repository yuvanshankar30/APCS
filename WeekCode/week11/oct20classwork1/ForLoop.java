// Replace each question with a comment that describes what the code is doing.
public class ForLoop{
	public void test1(){
		//1) Describe what is happening below
        /*Within this for loop statement, we are initializing and setting the initial value as a integer set to zero.
        Our boolean condition is that when i is less than ten, and each iteration, i gets added 1 to its previous value.
        This will print all integers from 0 to 9 in a sequence and on the same line(ascending order)  */
		System.out.println("\n\nTest1");
		for(int i=0; i < 10; i++){
			System.out.print(i + " ");
		}
    System.out.println();
	}
	
	public void test2(){
		//2) Describe what is happening below
        /*
        In this for loop, the initial value is a integer set to the value of 15. The boolean condition checks whether this number is greater than 2.
        The increment is set so that after each iteration of the loop, 1 is subracted from the initial value. 
        This for loop prints all integers from 15 to 3 in a descending order (prints all on the same line.)
         */
		System.out.println("\n\nTest2");
		for(int i=15; i > 2; i--){
			System.out.print(i + " ");
		}
    System.out.println();
	}
	
	public void test3(int max){
		//3) Describe what is happening below
        /*
        In this loop and method, the initial value is an integer set to 0. The boolean expression is i <= max, where max is an integer that is set as
        a parameter within this method(test3)
        This will output numbers in an ascending order, and increment by 5 until the number is greater than the parameter the user sets
        Say max is 22, then it will be 5 10 15 20
         */
		System.out.println("\n\nTest3");
		for(int i=0; i <= max; i+=5){
			System.out.print(i + " ");
		}
    System.out.println();
	}
	
	public void test4(int min, int max){
		//4) Describe what is happening below
        /* 
        In this loop, the initial value is set to an integer with the value of max, which is a integer-type parameter in the test4 method. 
        The boolean condition checks whether the initial value is greater than min(integer-type parameter of the test4 method)
        Basically we are checking whether max is greater than min. The increment is set to subtract 2 from the previous value after each iteration.
        Say min is 5 and max is 10, then it will print 10,8,6 and will break out of the loop at 4
         */
		System.out.println("\n\nTest4");
		for(int i=max; i > min; i-=2){
			System.out.print(i + " ");
		}
	System.out.println();
	}
	
	//5) When does it make sense to use a for loop instead of a while loop?
    //It makes sense to use a for loop instead of while loop when you know a specific amount of iterations that your loop or action should go through. 


}
