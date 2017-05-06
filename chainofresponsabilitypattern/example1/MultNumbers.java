package main.chainofresponsabilitypattern.example1;

public class MultNumbers implements Chain{
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain chain) {
        this.nextInChain =chain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalculationWanted() == "mult") {

            System.out.println(request.getNumber1()+" * "+request.getNumber2()+
                    " = "+request.getNumber1()*request.getNumber2());
        } else
        {
            System.out.println("Only add sub div and mul are available as a operation");
        }


    }

}
