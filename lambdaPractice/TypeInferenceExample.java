package main.lambdaPractice;



public class TypeInferenceExample {

    public static void main(String[] args) {

        // no need for () when u have only one argument in signature, return type will be figure out by the compiler
        StringLengthLambda myLambda = s -> s.length();
        System.out.println(myLambda.getLength("Hello World"));

        printLambda(s -> s.length());
    }

    interface StringLengthLambda {
        int getLength(String s);
    }

    public static void printLambda(StringLengthLambda l) {
        System.out.println(l.getLength("Hello World"));
    }
}
