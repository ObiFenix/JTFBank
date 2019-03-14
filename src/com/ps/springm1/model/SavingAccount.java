package com.ps.springm1.model;

import com.ps.springm1.Account;
import com.ps.springm1.Card;
import org.springframework.beans.factory.annotation.Autowired;

public
class SavingAccount implements Account {

    @Autowired
    private Card atmCard;

    public
    void setAtmCard(Card atmCard) { this.atmCard = atmCard; }

    public
    void onInit() { System.out.println("onInit menthod of Saving Account has been invoked"); }

    public
    void onDestroy() { System.out.println("onDestroy menthod of Saving Account has been invoked"); }

    @Override
    public
    String createAccount() { return "Saving Account Hast Been Created succsessfully!"; }

    @Override
    public
    String cardDetails() { return atmCard.cardDetails(); }
}
