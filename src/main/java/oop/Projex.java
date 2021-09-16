package oop;

public class Projex {

    public Integer crackHeads;
    public String cornerStore;
    public String hoes;
    public String streetSweepers;
    public String bootlegLiquorStore;
    public String piece;

    //constructor [creating the Projex]
    public Projex(Integer crackHeads, String cornerStore, String hoes, String streetSweepers, String bootlegLiquorStore, String piece){
        this.crackHeads = crackHeads;
        this.cornerStore = cornerStore;
        this.hoes = hoes;
        this.streetSweepers = streetSweepers;
        this.bootlegLiquorStore = bootlegLiquorStore;
        this.piece = piece;

    }

    @Override
    public String toString() {
        return "Projex{" +
                "crackHeads=" + crackHeads +
                ", cornerStore='" + cornerStore + '\'' +
                ", hoes='" + hoes + '\'' +
                ", streetSweepers='" + streetSweepers + '\'' +
                ", bootlegLiquorStore='" + bootlegLiquorStore + '\'' +
                ", piece='" + piece + '\'' +
                '}';
    }

    public boolean getRobbed(String piece){
        if(piece.equalsIgnoreCase(piece)){
            return true;
        }
        return true;
    }

}
