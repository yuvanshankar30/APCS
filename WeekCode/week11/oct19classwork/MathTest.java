public class MathTest{

        public void divide(int num ,int den){
            //num is numerator and den is denominator

            double newden = (double)den;

            double result = num/newden;

            System.out.println("The result of this division gives back " + result);




        }

        

        public void slope(int x1,int x2,int y1, int y2){
            //y2 - y1 all divided by x2 - x1

            int ydiff = y2 - y1;
            double xdiff = (double)(x2 - x1);

            double slope = ydiff / xdiff;

            System.out.println("The slope of a line with these points is " + slope);



        }
    



}