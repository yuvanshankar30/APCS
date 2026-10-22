import java.util.Scanner;
public class Runner{

    public static void main(String[] args) {
        int count = 1;
        while(count<13){
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        count = 0;
        while(count <= 18){
            System.out.print(count + " ");
            count += 2;

        }
        System.out.println();
        count = 15;
        while(count >= -10){
            System.out.print(count + " ");
            count -= 5;

        }
        System.out.println();

        Scanner sc = new Scanner(System.in);

        
        int startnum = 0;
        

        System.out.print("Provide a number that is greater than 20: ");
        int endnum = sc.nextInt();
        System.out.println("Provide a step (What will be counted by) ");
        int step = sc.nextInt();

        while(startnum <= endnum ){
            System.out.print(startnum + " ");
            startnum += step;
            
        }
        System.out.println();

        

        

        
    }
    






}