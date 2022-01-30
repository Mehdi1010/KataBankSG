package com.kata.bank.sg.accountservice.model;


public class StatementLine {

    private Operation operation;
    private Amount currentBalance;

    public StatementLine(Operation operation, Amount currentBalance) {
        this.operation = operation;
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString() {
        return "StatementLine [Date=" + operation.getDate()  + ", Amount=" + operation.getValue();
    }

}
