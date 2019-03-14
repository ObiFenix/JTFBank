package com.ps.springm1.model;

import com.ps.springm1.Account;
import com.ps.springm1.Card;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLOutput;

public
class CheckingAccount implements Account {

    @Autowired
    private Card debitCard;

    public
    void setDebitCard(Card debitCard) { this.debitCard = debitCard; }

    public
    void onInit() { System.out.println("onInit menthod of CheckingAccount has been invoked"); }

    public
    void onDestroy() {
        System.out.println("onDestroy menthod of CheckingAccount has been invoked");
    }

    @Override
    public
    String createAccount() {
        return "Checking Account Has Been Created Successfully!";
    }

    @Override
    public
    String cardDetails() {
        return debitCard.cardDetails();
    }

}
