package oop;

public class BrooklynZoo {
    public static void main(String[] args) {

        //datatype variableName = new Dog() <- because thats the datatype of the object youre trying to create
        Dog dog1 = new Dog("Bingo", 200, "Pit-bull"); //using the constructor to specify the properties we want when creating a dog
        Dog dog2 = new Dog();

        System.out.println(dog1);
        System.out.println(dog1.bark());


//        dog1.breed = "Pit-bull";
//        dog1.name = "Bingo";
//        dog1.size = 200;
//        dog1.bark();
//        System.out.println(dog1);
//        System.out.println(dog1.bark());

        dog2.breed = "Yorkie";
        dog2.name = "Princess";
        dog2.size = 20;
        dog2.bark();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        System.out.println(dog2);
        System.out.println(dog2.bark());

    }
}
