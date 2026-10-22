public class Oven {

    //this is a program for all oven methods that will be called on the oven object.
    

    public void checkTemp(){
        double temperature = (Math.random() * 250) + 250;
        double rounded = Math.round(temperature * 100.0) / 100.0; 


        if (temperature <= 425){
            System.out.println("The oven is ready at a temperature of " + rounded);

        }else{
            System.out.println("The oven is too hot at a temperature of " + rounded);
        }


    }
    public void checkTimer(){
        int minutesleft = (int)(Math.random() * 11);

        if (minutesleft < 2){
            System.out.println("Beep Beep");
            System.out.println("There are " + minutesleft + " minutes left ");
        }
        else{
            System.out.println("There are " + minutesleft + " minutes left ");

        }

    }
    public void bakePizza(){
        int minutes = (int) (Math.random() * 16) + 5;

        if(minutes > 15){
            System.out.println("The pizza is in danger of burning");

        }else{
            System.out.println("The pizza will bake nicely");
        }
        System.out.println("Amount of minutes is " + minutes);


    }


    
}
