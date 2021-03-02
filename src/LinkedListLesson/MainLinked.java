package LinkedListLesson;

public class MainLinked {
    public  static void main (String[] args){
        Customer customer = new Customer("Nat", 54.85);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.55);
        System.out.println("Balance " + customer.getName() + customer.getBalance());
    }
}
