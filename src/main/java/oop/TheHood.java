package oop;

public class TheHood {
    public static void main(String[] args) {

        // public Projex(Integer crackHeads, String cornerStore, String hoes, String streetSweepers, String bootlegLiquorStore, String piece)

        Projex northSide = new Projex(10,"R&C Deli", "All da hoes", "desert eagles", "Liqs and tricks", "cuban piece");
        northSide.crackHeads -= 1; //a crackhead died remove 1 from crackHeads

        Projex southSide = new Projex(100,"Gully Deli", "One hoe", "glock", "Ravandem Store", "fugesi");


        System.out.println(northSide.getRobbed("cuban piece"));

        System.out.println(northSide);



    }

}
