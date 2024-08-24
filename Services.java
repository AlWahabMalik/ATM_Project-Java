public interface Services {
    
    double withdraw(double amount);
    double deposite(double amount);
    double Transaction(double amount,int transferID);
    void checkbalance();
    void accountdetails(Customer user);
}
