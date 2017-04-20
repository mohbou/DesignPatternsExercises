package main.miscellaneous;


public class Money {

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    private final int amount;
    private final String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if ( o instanceof Money)
        {
            Money money = (Money) o;
            return money.getCurrency().equals(getCurrency()) && getAmount() == money.getAmount();

        }
        return false;

    }


}
