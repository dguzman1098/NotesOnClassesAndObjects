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
        Animal cat1 = new Cat();



    }


}
