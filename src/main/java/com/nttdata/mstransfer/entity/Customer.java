package com.nttdata.mstransfer.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class Customer {


    private String id;


    private String name;


    private String lastName;


    private TypeCustomer typeCustomer;


    private String document;


    private Integer age;


}
