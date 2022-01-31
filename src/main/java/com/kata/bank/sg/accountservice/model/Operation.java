package com.kata.bank.sg.accountservice.model;

import java.util.Date;

public class Operation {

    private Amount value;
    private Date date;

    public Operation(Amount value, Date date){
        this.value = value;
        this.date = date;
    }

    public Operation(){
        super();
    }

    public Amount balanceAfterOperation(Amount currentBalance) {
        return currentBalance.plus(value);
    }

    public Amount getValue() {
        return value;
    }

    public void setValue(Amount value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
