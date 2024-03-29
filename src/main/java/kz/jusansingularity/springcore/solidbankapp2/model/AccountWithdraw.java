package kz.jusansingularity.springcore.solidbankapp2.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AccountWithdraw extends Account{
    public AccountWithdraw(AccountType accountType, String id, String clientID, double balance, boolean withdrawAllowed){
        super(accountType, id, clientID, balance, withdrawAllowed);
    }
}
