package com.nttdata.mstransfer.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class FixedTerm {

    private String accountNumber;

    private Customer customer;

    private float commission;

    private int movement_limit;

    private LocalDateTime registration_date;

    private int movementNumber;

    private LocalDate movementDate;



}
