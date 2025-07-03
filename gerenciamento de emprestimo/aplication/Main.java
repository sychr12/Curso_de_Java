package aplication;

import entities.account;
import entities.businessaccount;
import entities.sevingsaccount;

public class Main {

    public static void main(String[] args) {

        businessaccount account = new businessaccount();

        account acc = new account(1001, "Alex", 1000.0);
        businessaccount bacc = new businessaccount(1002, "maria", 0.0, 500.0);

        // Upcasting

        account acc1 = bacc;

        account acc2 = new businessaccount(1003, "bob", 1000.0, 500.0);
        account acc3 = new sevingsaccount(1004, "anna", 1000.0, 0.01);

        // Downcasting

        businessaccount acc4 = (businessaccount) acc2;
        acc4.loan(100.0);

        //businessaccount acc5 = (businessaccount) acc3;

        if(acc3 instanceof businessaccount){
            businessaccount acc5 = (businessaccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan");
        }

        if(acc3 instanceof sevingsaccount){
            sevingsaccount acc5 = (sevingsaccount)acc3;
            acc5.updatebalance();
            System.out.println("Update! ");
        }


        acc.witdraw(200.0);
        System.out.println(acc.getBalance());

        acc3.witdraw(200.0);
        System.out.println(acc3.getBalance());

        acc2.witdraw(200.0);
        System.out.println(acc2.getBalance());




        //Polimofismo
        
        account x = new account(1020,"alex",1000.0);
        account y = new sevingsaccount(1023,"Maria", 1000.0 ,0.10);

        x.witdraw(50.0);
        y.witdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }


}