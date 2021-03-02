package AutoBoxingChallenge;

public class MainBank {
    public static void main (String[] args){

        BankApplication bank = new BankApplication("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adeilade", "Time",50.56);
        bank.addCustomer("Adelaide", "Mikke", 178.56);
        bank.addCustomer("Adelaide", "Nataly",320.56);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.66);

        bank.addCustomerTransaction("Adelaide", "Nataly", 45.23);
        bank.addCustomerTransaction("Adelaide", "Nataly", 12.23);
        bank.addCustomerTransaction("Adelaide", "Leila", 1.52);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        if(!bank.addCustomer("Melbourne", "Brian", 5.85)){
            System.out.println("Error, Melbourne does not exist");
        }
    }
}
