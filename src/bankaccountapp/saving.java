package bankaccountapp;

public class  saving extends account {
    private int SafetyDepositBoxId;
    private int SafetyDepositBoxKey;
    public saving(String name,String ssn, double initDeposit) {
        super(name,ssn,initDeposit);
        accountNumber=1+accountNumber;
        setSafetyDepositBox();
        setSafetyDepositBoxKey();

    }
    @Override
    public void setRate() {
        rate=getBaseRate()-0.25;

    }
    private void setSafetyDepositBox() {
        SafetyDepositBoxId=(int) (Math.random()*Math.pow(10, 3));

    }
    private void setSafetyDepositBoxKey() {
        SafetyDepositBoxKey=(int) ((Math.random())*Math.pow(10, 4));
    }
    public void showInfo() {
        super.showInfo();// super class can help
        System.out.println("Saving account features:"
                +"\nSafety Deposit Box Id: "+SafetyDepositBoxId
                +"\nSafety Deposit Box Key: "+SafetyDepositBoxKey);
    }



    //list common properties specific to saving account
    // constructor to initialize saving account
    //specific method for saving account

}
