public class Rect {
    private int length;
    private int width;
    private int area;

    public Rect(){
        length = 7;
        width = 7;
    }

    public Rect(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void printArea(){
        calcArea();
        System.out.println("The area is " + area);
    }

    private void calcArea(){
        area = length * width;
    }
}
