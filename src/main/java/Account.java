public class Account {

    private String accountNumber;
    // Variable de instancia
    private  double balance; //  Esta variable está asociada al objeto de BankAccount

    // Un constructor que inicializa el número de cuenta y el saldo.
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposite(double amount) {
        this.balance +=amount; // this. referencia al objeto actual en el que se esta ejecutando el metodo
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > this.balance) {
            throw new InsufficientFundsException();
        }
        this.balance -= amount;
    }

    public double getBalance() {
        System.out.println("Saldo actual: " + this.balance);
        return balance;
    }
}
