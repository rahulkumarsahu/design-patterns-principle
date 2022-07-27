package com.design.patterns.creational.abstractfactory.dto;

public class ICICI implements Bank {

    private final String bankName;

    public ICICI(){
        bankName = "ICICI BANK";
    }
    public String getBankName() {
        return bankName;
    }
}
