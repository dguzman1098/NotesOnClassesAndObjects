package oop;

public class Cat extends Animal{

    String breed;
    int size;

    public Cat(){

    }

    public void speak(){
        System.out.println("Meow!");
    }


    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.speak();



    }


}
