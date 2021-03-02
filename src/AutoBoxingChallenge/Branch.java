package AutoBoxingChallenge;

import java.util.ArrayList;

public class Branch {
    private String name;
    ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers  = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    // need to be able to add a new customer and an initalAmount transaction
// we use boolean because if customer alreadyexists it will return false because this customer is on file
    public boolean newCustomer (String customerName, double initialAmount){
        if(findCustomer (customerName) ==null){
            this.customers.add(new Customer(customerName, initialAmount));//Customer is OBJECT
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction (String customerName, double amount){
        Customer existingCustomer = findCustomer (customerName);
        if(existingCustomer !=null){
            existingCustomer.addTransaction(amount);

            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i =0; i<this.customers.size(); i++){
            Customer checkedCustomer = this.customers.get(i);
            if(this.customers.get(i).getName().equals(customerName)){
                return this.customers.get(i);
            }
        }
        return null;
    }
}
