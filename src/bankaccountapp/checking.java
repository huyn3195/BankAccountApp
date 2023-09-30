package bankaccountapp;

public class checking extends account{
    private int debitCardNumber;
    private int debitCardPin;

    //list common properties to checking account: debit card, pin,etc
    public checking(String name,String ssn,double initDeposit) {
        super(name,ssn,initDeposit);
        accountNumber=2+accountNumber;
        setDebitCardNumber();
        setDebitCardPin();

    }
    @Override
    public void setRate() {
        rate=getBaseRate()*0.15;

    }

    private void setDebitCardNumber() {
        debitCardNumber=(int) (Math.random()*Math.pow(10, 12));

    }
    private void setDebitCardPin() {
        debitCardPin=(int)(Math.random()*Math.pow(10,4));
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("Checking account features"
                +"\nDebit Card Number: "+debitCardNumber+
                "\nDebit Card Pin: "+debitCardPin);

    }
    //list any specific method ot a checking account
    // call the constructor to initialize the checking account



}
