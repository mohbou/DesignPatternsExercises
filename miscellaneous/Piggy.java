package main.miscellaneous;

public class Piggy {

    private int quarter;
    private int dime;
    private int total;


    public int getDime() {
        return dime;
    }

    public void setDime(int dime) {
        this.dime = dime;
    }




    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }


    public int getQuarter() {
        return quarter;
    }

    public int addQuarters(int amount) {

        return amount>=0?quarter+=amount:quarter;
    }

    public int addDimes(int amount) {
        return amount>=0?dime+=amount:dime;
    }


    public int removeQuarters(int amount) {
        if(amount <0)
            return quarter;
        else
        return amount<quarter?quarter-=amount:0;
    }

    public int getTotal() {
        quarter=2;
        dime=10;
        return quarter*25+dime*10;
    }
}
