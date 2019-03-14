package com.ps.springm1.model;

import com.ps.springm1.Card;

public class ATMCard implements Card {

    @Override
    public String cardDetails() {
        return "ATM Card Has Been Issued Successfully";
    }
}
