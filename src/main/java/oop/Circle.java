package oop;

public class Circle {

    final double pi = Math.PI;
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calcArea(){
        return pi * (Math.pow(radius, 2)); //or pi * (radius*radius)
    }

    public double calcCircumference(){
        return 2 * pi * radius;
    }

    public double volumeOfSphere(){
        return 4/3*(pi*(Math.pow(radius, 3)));
    }


    public static void main(String[] args) {
        Circle circ1 = new Circle(10);
        System.out.println(circ1.calcArea());
        System.out.println(circ1.calcCircumference());
        System.out.println(circ1.volumeOfSphere());


    }

}
