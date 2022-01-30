package com.kata.bank.sg.accountservice.model;

import java.text.DecimalFormat;

public class Amount {

    private DecimalFormat decimalFormat = new DecimalFormat("#.00");

    private int value;

    public Amount(int value) {
        this.value = value;
    }

    public static Amount amountOf(int value) {
        return new Amount(value);
    }

    public Amount plus(Amount otherAmount) {
        return amountOf(this.value + otherAmount.value);
    }

    public Amount negative() {
        return amountOf(-value);
    }

}
