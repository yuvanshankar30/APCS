public class QuizPractice{

    


    public int factorial(int num){

        int result = 1;

        while (num> 1){
            
            result *= num;
            num --;

           

        }


        return result;


    }

    public void countupBy5(int i){

        int count = 0;

        do{
            count += 5;
            System.out.print(count + " ");
            
            


        }while(count < i);

        System.out.println();

    }

}