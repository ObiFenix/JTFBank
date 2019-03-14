package com.ps.springm1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankAccount {

    public static void main (String []args) {

        // Bean Config Type
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Account loan = context.getBean("loanAccount", Account.class);
        Account saving = context.getBean("savingAccount", Account.class);
        Account checking = context.getBean("checkingAccount", Account.class);

        System.out.printf("\n[ Loan Account ]\n%s\n%s%n\n", loan.createAccount(),  loan.cardDetails());
        System.out.printf("\n[ Saving Account ]\n%s\n%s%n\n", saving.createAccount(), saving.cardDetails());
        System.out.printf("\n[ Checking Account ]\n%s\n%s%n\n", checking.createAccount(), checking.cardDetails());

        context.close();
    }
}