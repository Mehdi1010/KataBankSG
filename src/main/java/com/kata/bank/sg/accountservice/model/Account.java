package com.kata.bank.sg.accountservice.model;

import java.util.Date;

public class Account {

    private Statement statement;

    private Amount balance = Amount.amountOf(0);

    public Account(Statement statement) {
        this.statement = statement;
    }

    public void deposit(Amount value, Date date) {
        recordOperation(value, date);
    }

    public void withdrawal(Amount value, Date date) {
        recordOperation(value.negative(), date);
    }


    private void recordOperation(Amount value, Date date) {
        Operation operation = new Operation(value, date);
        Amount balanceAfterTransaction = operation.balanceAfterOperation(balance);
        balance = balanceAfterTransaction;
        statement.addLineContaining(operation, balanceAfterTransaction);
    }
}
