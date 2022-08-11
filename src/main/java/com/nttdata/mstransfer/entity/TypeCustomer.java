package com.nttdata.mstransfer.entity;

import lombok.Data;

@Data
public class TypeCustomer {
    String id;

    EnumTypeCustomer value;

    public enum EnumTypeCustomer {
        EMPRESARIAL, PERSONAL
    }
}
