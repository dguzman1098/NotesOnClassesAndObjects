package oop;
//A class is a blueprint for creating objects

public class GingerBreadMold {

    //properties, attributes, fields, instance variables
    public int arms;
    public int legs;
    public int head;
    public int gumdropButtons;

    //Methods are actions, verbs, things the object do
    public void speak() {
        System.out.println("Eat me bitch");
    }

    public void bake(){
        System.out.println("I'm ready to be eaten");
    }

    @Override
    public String toString() {
        return "GingerBreadMold{" +
                "arms=" + arms +
                ", legs=" + legs +
                ", head=" + head +
                '}';
    }
}
