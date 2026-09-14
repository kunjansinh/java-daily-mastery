// Name: Kunjan

class BankAccount
{
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance)
    {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Deposited: £" + amount);
    }

    void withdraw(double amount)
    {
        if (amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrawn: £" + amount);
        }
        else
        {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance()
    {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: £" + balance);
    }

    public static void main(String[] args)
    {
        BankAccount account = new BankAccount("Kunjan", 500.00);

        account.displayBalance();

        System.out.println();

        account.deposit(200.00);
        account.withdraw(150.00);

        System.out.println();

        account.displayBalance();
    }
}
