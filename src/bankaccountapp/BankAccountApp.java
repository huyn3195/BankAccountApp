package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[]args) {
		/*checking chck1=new checking("Cat Huynh","123456789",1500);
		saving sav1=new saving("Daniel","123456789",2500);
		chck1.showInfo();
		System.out.println("**************");
		sav1.showInfo();*/
        List<account>accounts=new LinkedList<account>();


        String file="/Users/nguyencat/Desktop/COMPUTER SCIENCE/NewBankAccounts.csv";
        List<String[]>newAccountHolders=Ultilities.CSV.read(file);
        for(String[]accountHolder: newAccountHolders) {
            String name=accountHolder[0];
            String ssn=accountHolder[1];
            String accountType= accountHolder[2];
            double initDeposit=Double.parseDouble(accountHolder[3]);
            //System.out.println(name+" "+ssn+" "+accountType+" $"+initDeposit);
            if(accountType.equals("Savings")) {

                accounts.add(new saving(name,ssn,initDeposit));
            }else if(accountType.equals("Checking")) {

                accounts.add(new checking(name,ssn,initDeposit));
            }else {
                System.out.println("Trouble opening an account");
            }
        }
        accounts.get(5).withdraw(2000);
        accounts.get(5).showInfo();

    }

}
