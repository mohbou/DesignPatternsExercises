package main.miscellaneous;


public class Dummy {

    private static String name ="Test";

    public static void first(){}
    public static void second(){
        System.out.println(name);

    }

    public void third() {
        first();
        second();
    }
    public static void main(String[] args) {
        first();
        second();
        new Dummy().third();



    }
}
