package main.chainofresponsabilitypattern.example1;

public interface Chain {

    public void setNextChain(Chain chain);
    public void calculate(Numbers request);
}
