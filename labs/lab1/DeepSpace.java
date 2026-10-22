import java.util.Scanner;
/*
In this program, the user will choose to embark on a specific type of mission - either Orbital or Trivia.
Each question path has its own type of questions. For example, orbital asks math questions, while trivia, obviously answers triva questions
Depending on the amount of answers that you get correct, the more score you accumulate. At the end, your score is added up and you are given a mission grade.

*/

public class DeepSpace {
    
    public static void main(String args[]){
        
        String choice;
        String answer;
        int numberAnswer;
        int scoreCounter = 0;
        boolean firstThreeCorrect = true;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What mission stream would you like to embark on? Orbital or Trivia?");
        choice = sc.nextLine();

        //MATH QUESTIONS (ORBITAL PATH)
        if (choice.equalsIgnoreCase("orbital")){
            
            //Easy Question 1
            System.out.println("A Satellite orbits a fictional planet in a circular path with a radius of 7 KM. Using π = 22/7, how far does the satellite travel in one complete orbit? Give your answer as a single number");
            numberAnswer = sc.nextInt();
            sc.nextLine();
            if (numberAnswer == 44){
                System.out.println("CORRECT! The satellite travels 44 km.");
                scoreCounter++;
            }
            else{
                System.out.println("INCORRECT! The satellite does not travel " + numberAnswer + " kilometers.");
                firstThreeCorrect = false;
            }
            
            //Easy Question 2
            System.out.println("A rocket travels 1,200 km in 20 minutes. What is its average speed in km/minute? Give your answer as one Integer");
            numberAnswer = sc.nextInt();
            sc.nextLine();
            if (numberAnswer == 60){
                System.out.println("CORRECT!. The rocket travels at an average speed of 60 km/min!");
                scoreCounter++;
            }else{
                System.out.println("INCORRECT!. The rocket does not travel at an average speed of " + numberAnswer + " km/min!");
                firstThreeCorrect = false;
            }
            
            //Easy Question 3
            System.out.println("A spacecraft travels 360,000 km to reach the Moon at a constant speed of 10,000 km/h. How many hours does the trip take?");
            numberAnswer = sc.nextInt();
            sc.nextLine();
            if (numberAnswer == 36){
                System.out.println("CORRECT! The trip takes 36 hours");
                scoreCounter++;
            }
            else{
                System.out.println("INCORRECT! The trip does not take " + numberAnswer + " hours");
                firstThreeCorrect = false;
            }
            

            //Hard questions and remaining Easy Questions in one logic area
            if (!firstThreeCorrect){
                
                //Easy Question 4
                System.out.println("A satellite travels 42,000 km during one orbit. If it travels at 7 km/s, how many seconds does one orbit take?");
                numberAnswer = sc.nextInt();
                sc.nextLine();
                if (numberAnswer == 6000){
                    System.out.println("CORRECT! One orbit takes 6000 seconds");
                    scoreCounter++;

                }else{
                    System.out.println("INCORRECT! One orbit does not take " + numberAnswer + " seconds");

                }

                //Easy Question 5   
                System.out.println("An alien planet has an escape velocity of 8 km/s. A spaceship leaves the planet at 12 km/s. How much faster than the escape velocity is the spaceship traveling? Give your answer as one integer");
                numberAnswer = sc.nextInt();
                sc.nextLine();
                if (numberAnswer == 4){
                    System.out.println("CORRECT! The spaceship is travelling 4 km/s faster");
                    scoreCounter++;

                }else{
                    System.out.println("INCORRECT! The spaceship is not traveling " + numberAnswer + " km/s faster");
                    
                }

                //Easy Question 6
                System.out.println("A space station completes 12 orbits around a planet in 24 hours. How many hours does each orbit take?");
                numberAnswer = sc.nextInt();
                sc.nextLine();
                if (numberAnswer == 2 ){
                    System.out.println("CORRECT! Each orbit takes 2 hours");
                    scoreCounter++;

                }else{
                    System.out.println("INCORRECT! Each orbit does not take " + numberAnswer + " hours");
                    
                }
            }
            else{
                
                //Hard Question 1
                System.out.println("A spacecraft is traveling at 8 km/s and accelerates at 3 km/s^2 for 6 seconds. Using v = u + at, what is its final velocity in km/s?");
                numberAnswer = sc.nextInt();
                sc.nextLine();
                if (numberAnswer == 26){
                    System.out.println("CORRECT! The final velocity is 26 km/s");
                    scoreCounter++;
                }else{
                    System.out.println("INCORRECT! The final velocity is not " + numberAnswer + " km/s");
                }

                //Hard Question 2
                System.out.println("A spacecraft travels at an orbital velocity of 10 km/s around a fictional planet with GM = 400,000 km^3/s^2. Using r = GM/v^2, what is the orbital radius in km?");
                numberAnswer = sc.nextInt();
                sc.nextLine();
                if (numberAnswer == 4000){
                    System.out.println("CORRECT! The orbital radius is 4000 km");
                    scoreCounter++;
                }else{
                    System.out.println("INCORRECT! The orbital radius is not " + numberAnswer + " km");
                }

                //Hard Question 3
                System.out.println("A spacecraft increases its speed from 20 km/s to 30 km/s. What is the percentage increase in its speed? Give your answer as one integer.");
                numberAnswer = sc.nextInt();
                sc.nextLine();
                if (numberAnswer == 50){
                    System.out.println("CORRECT! The speed increased by 50 percent");
                    scoreCounter++;
                }else{
                    System.out.println("INCORRECT! The speed did not increase by " + numberAnswer + " percent");
                }
            }
            
            calculateScore(scoreCounter);
            
        }
        
        //TRIVIA QUESTIONS AND LOGIC (ALIEN TRIVIA)
        else if (choice.equalsIgnoreCase("trivia")){

            //Easy Question 1
            System.out.println("Which planet is known as the Red Planet?");
            System.out.println("A. Venus");
            System.out.println("B. Mars");
            System.out.println("C. Jupiter");
            System.out.println("D. Saturn");
            answer = sc.nextLine();

            if (answer.equalsIgnoreCase("B")){
                System.out.println("CORRECT! Mars is the Red Planet.");
                scoreCounter++;
            }else{
                System.out.println("INCORRECT! The correct answer is B.");
                firstThreeCorrect = false;
            }

            //Easy Question 2
            System.out.println("Which object orbits Earth?");
            System.out.println("A. The Moon");
            System.out.println("B. Mars");
            System.out.println("C. The Sun");
            System.out.println("D. Jupiter");
            answer = sc.nextLine();

            if (answer.equalsIgnoreCase("A")){
                System.out.println("CORRECT! The Moon orbits Earth.");
                scoreCounter++;
            }else{
                System.out.println("INCORRECT! The correct answer is A.");
                firstThreeCorrect = false;
            }

            //Easy Question 3
            System.out.println("Which star is closest to Earth?");
            System.out.println("A. Sirius");
            System.out.println("B. Betelgeuse");
            System.out.println("C. The Sun");
            System.out.println("D. Polaris");
            answer = sc.nextLine();

            if (answer.equalsIgnoreCase("C")){
                System.out.println("CORRECT! The Sun is the closest star to Earth.");
                scoreCounter++;
            }else{
                System.out.println("INCORRECT! The correct answer is C.");
                firstThreeCorrect = false;
            }

            //Hard questions and Remaining Easy Questions in one logic area
            if (!firstThreeCorrect){
                
                //Easy Question 4
                System.out.println("Which planet is the largest in our solar system?");
                System.out.println("A. Earth");
                System.out.println("B. Mars");
                System.out.println("C. Jupiter");
                System.out.println("D. Neptune");
                answer = sc.nextLine();

                if (answer.equalsIgnoreCase("C")){
                    System.out.println("CORRECT! Jupiter is the largest planet.");
                    scoreCounter++;
                }else{
                    System.out.println("INCORRECT! The correct answer is C.");
                }

                //Easy Question 5
                System.out.println("What force keeps planets in orbit around stars?");
                System.out.println("A. Magnetism");
                System.out.println("B. Gravity");
                System.out.println("C. Friction");
                System.out.println("D. Electricity");
                answer = sc.nextLine();

                if (answer.equalsIgnoreCase("B")){
                    System.out.println("CORRECT! Gravity keeps planets in orbit.");
                    scoreCounter++;
                }else{
                    System.out.println("INCORRECT! The correct answer is B.");
                }

                //Easy Question 6
                System.out.println("Which planet is famous for its large ring system?");
                System.out.println("A. Saturn");
                System.out.println("B. Mercury");
                System.out.println("C. Venus");
                System.out.println("D. Mars");
                answer = sc.nextLine();

                if (answer.equalsIgnoreCase("A")){
                    System.out.println("CORRECT! Saturn has a large ring system.");
                    scoreCounter++;
                }else{
                    System.out.println("INCORRECT! The correct answer is A.");
                }
            }
            else{
                
                //Hard Question 1
                System.out.println("An alien civilization sends a message from a planet 40 light-years away. Approximately how long would the message take to reach Earth?");
                System.out.println("A. 4 years");
                System.out.println("B. 40 years");
                System.out.println("C. 400 years");
                System.out.println("D. 4,000 years");
                answer = sc.nextLine();

                if (answer.equalsIgnoreCase("B")){
                    System.out.println("CORRECT! The message would take 40 years to reach Earth.");
                    scoreCounter++;
                }else{
                    System.out.println("INCORRECT! The correct answer is B.");
                }

                //Hard Question 2
                System.out.println("What type of star can explode as a supernova and potentially leave behind a neutron star?");
                System.out.println("A. A massive star");
                System.out.println("B. A small red dwarf");
                System.out.println("C. An asteroid");
                System.out.println("D. A planet");
                answer = sc.nextLine();

                if (answer.equalsIgnoreCase("A")){
                    System.out.println("CORRECT! A massive star can leave behind a neutron star.");
                    scoreCounter++;
                }else{
                    System.out.println("INCORRECT! The correct answer is A.");
                }

                //Hard Question 3
                System.out.println("An alien planet has liquid water and temperatures that could support life. What is the region around a star where liquid water could exist on a planet's surface called?");
                System.out.println("A. The Asteroid Belt");
                System.out.println("B. The Event Horizon");
                System.out.println("C. The Goldilocks Zone");
                System.out.println("D. The Dark Zone");
                answer = sc.nextLine();

                if (answer.equalsIgnoreCase("C")){
                    System.out.println("CORRECT! The habitable region is called the Goldilocks Zone.");
                    scoreCounter++;
                }else{
                    System.out.println("INCORRECT! The correct answer is C.");
                }
            }

            calculateScore(scoreCounter);

        }else{
            System.out.println("CRITICAL ERROR: Unauthorized stream selection. Aborting launch.");
        }
        
        sc.close();
    }
    
    public static void calculateScore(int scoreCounter){
        
        System.out.println("Final Mission Score: " + scoreCounter + "/6");

        if (scoreCounter >= 0 && scoreCounter <= 2){
            
            System.out.println("Mission Failed - Ship lost in deep space. Grade: F");
            
        }
        else if (scoreCounter == 3){
            
            System.out.println("Critical Systems damaged. Grade: D");
        }
        else if (scoreCounter == 4){
            
            System.out.println("Mission Sustained. Grade: C");
        }
        else if (scoreCounter == 5){
            
            System.out.println("Successful Orbit. Grade: B");
        }
        else if (scoreCounter == 6){
            
            System.out.println("Flawless Execution - Mission Aced. Grade: A");
        }
        
    }
    
}