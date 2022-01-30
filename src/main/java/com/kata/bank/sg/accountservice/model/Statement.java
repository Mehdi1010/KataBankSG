package com.kata.bank.sg.accountservice.model;

import java.util.LinkedList;
import java.util.List;

public class Statement {

    private static final int TOP_OF_THE_LIST = 0;

    private List<StatementLine> statementLines = new LinkedList<>();

    public void addLineContaining(Operation operation, Amount currentBalance) {
        statementLines.add(TOP_OF_THE_LIST, new StatementLine(operation, currentBalance));
    }

    public void printTo() {
        printStatementLines();
    }

    private void printStatementLines() {
        for (StatementLine statementLine : statementLines) {
            statementLine.toString();
        }
    }
}
