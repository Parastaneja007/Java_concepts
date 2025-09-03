package Encapsulation;

public class Bank_account {
    private long account_no ;
    private float balance;
    public void deposite(double amount){
        if(amount < 0){
            System.out.println("can not deposite ");
        }
        else
            balance += amount;
        System.out.println("current balance is" + balance);
    }
    public void withdraw(double amount){
        if(amount <= balance && amount > 0 ){
            balance -= amount ;
            System.out.println("amount withdraw successfully , current balance is " + balance);
        }
        else
            System.out.println("insuffitient account balance or invalid input");
    }

    public long getAccount_no() {
        return account_no;
    }

    public void setAccount_no(long account_no) {
        this.account_no = account_no;
    }

    public float getBalance() {
        return balance;
    }

}
