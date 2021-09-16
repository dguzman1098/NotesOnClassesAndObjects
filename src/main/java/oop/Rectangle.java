package oop;

//Create a rectangle class
//Give it properties
//create a method to calculate the area of the rectangle

//Go inside main
    //create one rectangle object
    //set width and length
    //invoke or call the rectangle method

public class Rectangle {

    public int width;
    public int length;

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public int calcAreaOfRectangle(){
        System.out.print("The area of the rectangle is: ");
        return length * width;
    }

    public int calcPerimeter(){
        System.out.println("The perimeter of the rectangle is: ");
        return 2*(length+width);
    }


    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(10, 10);
        System.out.println(rectangle1);
        System.out.println(rectangle1.calcAreaOfRectangle());
        System.out.println(rectangle1.calcPerimeter());



    }
}
