package oop;

public class Animal {

    public String name;


    public Animal(){

    }

    public Animal(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public void printName(){

        System.out.println("Type of animal: " + name);
    }


    public static void main(String[] args) {
        Animal animal1 = new Animal("Cat");
        animal1.printName();


    }
}
