package Encapsulation;

public class Account_check {
    public static void main(String[] args) {
        Bank_account acc1 = new Bank_account();
        acc1.deposite(500);
        acc1.withdraw(501);
        acc1.withdraw(150);
        acc1.setAccount_no(8378978);
        System.out.println(acc1.getAccount_no());
        System.out.println(acc1.getBalance());
    }
}
