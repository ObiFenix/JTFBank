package com.ps.springm1;

import com.ps.springm1.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public
class BankConfig {

    /*
    * Available Cards Prototypes
    * */
    @Bean
    public
    DebitCard debitCard() { return new DebitCard();  }

    @Bean
    public
    CreditCard CreditCard() { return new CreditCard();  }

    @Bean
    public
    ATMCard atmCard() { return new ATMCard();  }


    /*
    *
    * Available Account Prototypes
    * */
    @Bean (initMethod = "onInit", destroyMethod = "onDestroy")
    @Scope("prototype")
    public
    CheckingAccount checkingAccount() { return new CheckingAccount(); }

    @Bean (initMethod = "onInit", destroyMethod = "onDestroy")
    @Scope("prototype")
    public
    SavingAccount savingAccount() { return new SavingAccount(); }

    @Bean (initMethod = "onInit", destroyMethod = "onDestroy")
    public
    LoanAccount loanAccount() { return new LoanAccount(this.CreditCard()); }
}
