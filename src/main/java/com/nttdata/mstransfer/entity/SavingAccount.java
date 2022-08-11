package com.nttdata.mstransfer.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SavingAccount {

    private String accountNumber;
    private Customer customer;
    private float commission;
    private int movement_limit;
    private int movementNumber;
    private float amountAvailable;
    private float amount;
    private LocalDateTime registration_date;
}
