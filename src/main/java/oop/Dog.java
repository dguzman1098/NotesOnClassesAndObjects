package oop;

//the blueprint/template
public class Dog {

    public String name;
    public int size;
    public String breed;


    //default constructor, what Dog will have when you create an object
    public Dog() {

    }

    //A concrete method Known as Overloading the constructor
    public Dog(String name, int size, String breed){
        this.name = name;
        this.size = size;
        this.breed = breed;
    }

    //method, action, verb of the object
    public String bark(){
        return "woof woof";
    }

    //Right-click, generate, toString <-- to generate a quick toString of Dog object
    @Override
    public String toString() {
        return "Dog{" +
                "size=" + size +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
