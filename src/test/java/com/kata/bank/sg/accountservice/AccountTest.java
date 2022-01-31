package com.kata.bank.sg.accountservice;

import com.kata.bank.sg.accountservice.model.Account;
import com.kata.bank.sg.accountservice.model.Amount;
import com.kata.bank.sg.accountservice.model.Operation;
import com.kata.bank.sg.accountservice.model.Statement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
public class AccountTest {

    @Mock
    private Statement statement;
    private Account account;
    private Operation operation;

    @Before
    public void initialise() {
        account = new Account(statement);
        operation = new Operation();

    }

    @Test
    public void should_add_deposit_line_to_statement() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date depositDate = simpleDateFormat.parse("31-01-2022");
        Amount depositAmount = Amount.amountOf(1000);

        account.deposit(depositAmount, depositDate);
        operation.setValue(depositAmount);
        operation.setDate(depositDate);

        Assert.assertEquals(account.getBalance().getValue(), 1000);
    }

    @Test
    public void should_add_withdraw_line_to_statement() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date withdrawalDate = simpleDateFormat.parse("01-02-2022");

        account.withdrawal(Amount.amountOf(500), withdrawalDate);
        operation.setValue(Amount.amountOf(-500));
        operation.setDate(withdrawalDate);

        Assert.assertEquals(account.getBalance().getValue(), -500);

    }


}
