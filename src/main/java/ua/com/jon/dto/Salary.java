package ua.com.jon.dto;

/**
 * Created by Bohdan on 14.03.2017
 */
public class Salary {
    private double amount;
    private String currency;

    public Salary() {}

    public Salary(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
