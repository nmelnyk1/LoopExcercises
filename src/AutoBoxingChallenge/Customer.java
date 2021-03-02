package AutoBoxingChallenge;

import java.util.ArrayList;

public class Customer {
    private String name;
    ArrayList<Double> transactions;

    public Customer(String name,double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double> ();
        addTransaction(initialAmount);// initialize transaction becasue we have to find
        // the array list of double transactions. It will add it to array list of transactions;

        // that's convert from a primitive to an object ->boxing
    }
    // mechanism to add transactions

    public void addTransaction (double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
