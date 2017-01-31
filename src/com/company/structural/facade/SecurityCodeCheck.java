package com.company.structural.facade;


public class SecurityCodeCheck {

    private int securityCode = 1234;

    private int getSecurityCode() {

        return securityCode;
    }

    public boolean isCodeCorrect(int securityCode) {

        return getSecurityCode() == securityCode;
    }
}
