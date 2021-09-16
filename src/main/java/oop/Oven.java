package oop;

public class Oven {


    public static void main(String[] args) {

        //DataType variable = new DataType();
        GingerBreadMold gman1 = new GingerBreadMold();
        gman1.arms = 2;
        gman1.legs = 2;
        gman1.head = 1;

        //Using the object ^ then .method() <- whatever your methods in GingerBreadMold are
        gman1.speak();

    }
}
