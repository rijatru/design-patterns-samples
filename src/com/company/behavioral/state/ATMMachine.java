package com.company.behavioral.state;

import com.company.behavioral.state.states.HasPin;
import com.company.behavioral.state.states.NoCash;
import com.company.behavioral.state.states.interfaces.ATMState;
import com.company.behavioral.state.states.HasCard;
import com.company.behavioral.state.states.NoCard;

public class ATMMachine {

    private ATMState hasCard;
    private ATMState noCard;
    private ATMState hasCorrectPin;
    private ATMState atmOutOfMoney;

    private ATMState atmState;

    private int cashInMachine = 2000;
    private boolean correctPinEntered = false;

    public ATMMachine() {

        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfMoney = new NoCash(this);

        atmState = noCard;

        if (cashInMachine < 0) {

            atmState = atmOutOfMoney;
        }
    }

    public void setATMState(ATMState newATMState) {

        atmState = newATMState;
    }

    public void setCashInMachine(int newCashInMachine) {

        cashInMachine = newCashInMachine;
    }

    public void insertCard() {

        atmState.insertCard();
    }

    public void ejectCard() {

        atmState.ejectCard();

    }

    public void requestCash(int cashToWithdraw) {

        atmState.requestCash(cashToWithdraw);
    }

    public void insertPin(int pinEntered) {

        atmState.insertPin(pinEntered);
    }

    public ATMState getYesCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasPin() {
        return hasCorrectPin;
    }

    public ATMState getNoCashState() {
        return atmOutOfMoney;
    }

    public int getCashInMachine() {
        return cashInMachine;
    }

    public void setCorrectPinEntered(boolean value) {
        this.correctPinEntered = value;
    }
}
