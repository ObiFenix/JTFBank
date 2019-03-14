package com.ps.springm1.model;

import com.ps.springm1.Account;
import com.ps.springm1.Card;

public
class LoanAccount implements Account {

    private Card creditCard;

    public
    LoanAccount(Card card) {
        creditCard = card;
    }

    public
    void onInit() { System.out.println("onInit menthod of Loan Account has been invoked"); }

    public
    void onDestroy() { System.out.println("onDestroy menthod of Loan Account has been invoked"); }

    @Override
    public
    String createAccount() {
        return "Loan Account Has Been Created Successfully!";
    }

    @Override
    public
    String cardDetails() {
        return creditCard.cardDetails();
    }
}
