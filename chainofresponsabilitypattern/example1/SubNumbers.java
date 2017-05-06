package main.chainofresponsabilitypattern.example1;

public class SubNumbers implements Chain {
    private Chain nextInChain;
    @Override
    public void setNextChain(Chain chain) {
    this.nextInChain =chain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalculationWanted() == "sub") {

            System.out.println(request.getNumber1()+" - "+request.getNumber2()+
                    " = "+(request.getNumber1()-request.getNumber2()));
        } else
        {
            System.out.println("passed it from sub to next in chain");
            nextInChain.calculate(request);
        }


    }
}
