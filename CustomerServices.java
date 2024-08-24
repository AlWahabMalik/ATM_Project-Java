public class CustomerServices implements Services {
    Customer user;
    
    public CustomerServices() {
    }

    public CustomerServices(Customer user) {
        this.user = user;
    }

    public Customer getUser() {
        return user;
    }

    public void setUser(Customer user) {
        this.user = user;
    }

    @Override
    public double withdraw(double amount) {
        return user.balance=user.getBalance()-amount;
    }

    @Override
    public double deposite(double amount) {
        return user.balance=user.getBalance()+amount;
    }

    @Override
    public double Transaction(double amount, int transferID) {
        return user.balance=user.getBalance()-amount;
    }

    @Override
    public void checkbalance() {
        System.out.println("your current balance is : "+user.getBalance());
    }

    @Override
    public void accountdetails(Customer user) {
        System.out.println(user.toString());
    }
    
    
    
}
