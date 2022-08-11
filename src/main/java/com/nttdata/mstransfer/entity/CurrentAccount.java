package com.nttdata.mstransfer.entity;

import lombok.Data;

@Data
public class CurrentAccount {


    private String id;

    private String name;

    private String lastName;

    private TypeCustomer typeCustomer;

    private String document;

}
