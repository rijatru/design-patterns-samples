package com.company.structural.facade;

public class AccountNumberCheck {

    private int accountNumber = 12345678;

    private int getAccountNumber() {

        return accountNumber;
    }

    public boolean accountActive(int accountNumber) {

        return getAccountNumber() == accountNumber;
    }
}
