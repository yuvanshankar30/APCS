public class RandEX {
    public static void main(String[] args) {

        int num1 = (int)(Math.random() * 25) + 1;
        int num2 = (int)(Math.random() * 25) + 1;

        System.out.println("Number 1 is " + num1 + ", and number 2 is " + num2);

        if (num1>num2){
            System.out.println("Number 1 is greater");
            int minimum = num2;
        }else if (num1 == num2){
            System.out.println("The two numbers are equal");

        }else if (num1<num2){
            System.out.println("Number 2 is greater");
            int minimum = num1;

        }
        double average = (double)((num1 + num2)/2.0);
        System.out.println("The average is " + average);

        int minimum = Math.min(num1, num2);

        int power = (int)Math.pow(minimum,4);

        System.out.println("The smallest number raised to the 4th power is " + power );
    }
}
