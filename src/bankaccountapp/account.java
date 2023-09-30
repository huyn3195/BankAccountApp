package bankaccountapp;

public abstract class account implements IBaseRate {
    String name;
    String ssn;
    double balance;
    protected	String accountNumber;
    protected double rate;
    static int index=10000;
    //list common properties, name, ssn for both saving, checking
    public account(String name, String ssn,double initDeposit) {
        this.name=name;
        this.ssn=ssn;
        balance=initDeposit;
        this.accountNumber=SetAccountNumber();
        index++;
        setRate();

    }
    public abstract void setRate();


    private String SetAccountNumber() {

        String lastTwoSSN=ssn.substring(ssn.length()-2,ssn.length());
        int unique_index=index;
        int randomDigits=(int) (Math.random()* Math.pow(10, 3));
        accountNumber=lastTwoSSN+unique_index+randomDigits;
        return accountNumber;
    }
    public void  showInfo() {
        System.out.println(
                "Name " +name
                        +"\nAccount Number: "+accountNumber+
                        "\nBalance: "+balance+
                        "\nRate: "+rate+"%"
        );
    }
    public void deposit(double amount) {
        balance+=amount;
        System.out.println("Depositing the amount: "+" $"+amount);
        printBalance();
    }
    public void withdraw(double amount) {
        balance-=amount;
        printBalance();
    }
    public void transfer(String toWhere,double amount) {
        balance-=amount;
        System.out.println("You transferred: "+" 4"+amount+" to "+toWhere);
        printBalance();

    }
    public void compound() {
        double accruedInterest=balance*(rate/100);
        balance= balance+accruedInterest;
        System.out.println("Accrued Interest : $"+ accruedInterest);

    }
    public void printBalance() {
        System.out.println(name+" Your balance: $"+balance);
    }

    //Construct  to set common properties and initialize the account

    //list common methods


}
