package main.prototypepattern.example1;

public class Sheep implements Animal {


    public Sheep() {
        System.out.println(" Make a sheep");
    }

    @Override
    public Animal makeCopy() {

        Sheep sheepClone=null;

        try {
            sheepClone = (Sheep) super.clone();
            System.out.println("Sheep Cloned...");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheepClone;
    }
}
