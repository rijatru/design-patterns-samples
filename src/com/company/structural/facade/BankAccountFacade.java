package com.company.structural.facade;


public class BankAccountFacade {

    private int accounNumber;
    private int securityCode;

    AccountNumberCheck accountNumberCheck;
    SecurityCodeCheck securityCodeCheck;
    FundsCheck fundsCheck;

    WelcomeToBank welcomeToBank;

    public BankAccountFacade(int accounNumber, int securityCode) {
        this.accounNumber = accounNumber;
        this.securityCode = securityCode;

        accountNumberCheck = new AccountNumberCheck();
        securityCodeCheck = new SecurityCodeCheck();
        fundsCheck = new FundsCheck();

        welcomeToBank = new WelcomeToBank();
    }

    public int getAccountNumber() {
        return accounNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToGet) {

        if (accountNumberCheck.accountActive(getAccountNumber()) &&
                securityCodeCheck.isCodeCorrect(getSecurityCode()) &&
                fundsCheck.haveEnoughMoney(cashToGet)) {

            System.out.println("Transaction Complete");

        } else {

            System.out.println("Transaction failed");
        }
    }

    public void depositCash(double cashToDeposit) {

        if (accountNumberCheck.accountActive(getAccountNumber()) &&
                securityCodeCheck.isCodeCorrect(getSecurityCode())) {

            fundsCheck.makeDeposit(cashToDeposit);

            System.out.println("Transaction Complete");

        } else {

            System.out.println("Transaction failed");
        }
    }
}
