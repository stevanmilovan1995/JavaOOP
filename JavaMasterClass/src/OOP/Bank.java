package OOP;

public class Bank {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber(int accountNumber) {
        return this.accountNumber;
    }

    public int getBalance(int balance) {
        return this.balance;
    }

    public String getCustomerName(String customerName) {
        return customerName;
    }

    public String getEmail(String email) {
        return this.email;
    }

    public int getPhoneNumber(int phoneNumber) {
        return this.phoneNumber;
    }

    public void setAccountNumber() {
        this.accountNumber = accountNumber;
    }

    public void setBalance() {
        this.balance = balance;
    }

    public void setCustomerName() {
        this.customerName = customerName;
    }

    public void setEmail() {
        this.email = email;
    }

    public void setPhoneNumber() {
        this.phoneNumber = phoneNumber;
    }

    public void depositeFunds(int balanceIncrement) {
         this.balance += balanceIncrement;
    }

    public void withdrawFunds(int deductFunds) {
        if(this.balance - deductFunds < 0) {
            System.out.println("Balance too low.");
        }
        else {
            this.balance -= deductFunds;
        }
    }

}
