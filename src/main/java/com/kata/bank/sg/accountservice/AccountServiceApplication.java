package com.kata.bank.sg.accountservice;

import com.kata.bank.sg.accountservice.model.Account;
import com.kata.bank.sg.accountservice.model.Amount;
import com.kata.bank.sg.accountservice.model.Statement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class AccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}

}
