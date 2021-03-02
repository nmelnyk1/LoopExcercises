package AutoBoxingChallenge;

import java.util.ArrayList;

public class BankApplication {

    private String name;
    ArrayList<Branch> branches;

    public BankApplication(String name) { //<- our bank will have a name
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    //everytime we add a customer , we need to specify the branch name, the customer
    //name and initital transaction

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);// first , we chekc if that branch exists thrugh method findBranch
        if (branchName != null) {
            // if it is null, there is a problem and we want to test if we're not equal to null
            //We will be able to add a customer if branch name exists
            return branch.newCustomer(customerName, initialAmount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (this.branches.get(i).getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    // the purpose of this method to return all customers for a given branch
    //optionally, all the transactions for that cusotmers
    public boolean listCustomers(String branchName, boolean showTransactions) {

        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customers for branch " + branch.getName());
            //we want to get a  list of customers that are a part of the branch

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + i + "]");
                if (showTransactions) {
                    // if showTransactions is true, we will get a list of transactions for those customers
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "]  Amount " + transactions.get(j));
                    }
                }
            }
            return true;// if the branch was null , it will return false
        } else {
            return false;
        }
    }
}
