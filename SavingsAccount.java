package lab1;

class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance*annualInterestRate)/12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}
public class SavingsAccountTest{
    public static void main(String[] args) {
       SavingsAccount ob1 = new SavingsAccount(2000.00);
        SavingsAccount ob2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(0.04);
        ob1.calculateMonthlyInterest();
        ob2.calculateMonthlyInterest();
        System.out.printf("Saver1 balance: $%.2f%n", ob1.getSavingsBalance());
        System.out.printf("Saver2 balance: $%.2f%n", ob2.getSavingsBalance());
        SavingsAccount.modifyInterestRate(0.05);
        ob1.calculateMonthlyInterest();
        ob2.calculateMonthlyInterest();
        System.out.printf("Saver1 new balance after 1st month: $%.2f%n", ob1.getSavingsBalance());
        System.out.printf("Saver2 new balance after 1st month: $%.2f%n", ob2.getSavingsBalance());
    }
}

