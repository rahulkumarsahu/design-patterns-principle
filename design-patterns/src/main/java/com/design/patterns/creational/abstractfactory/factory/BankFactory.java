package com.design.patterns.creational.abstractfactory.factory;

import com.design.patterns.creational.abstractfactory.dto.*;

public class BankFactory implements AbstractFactory{

    public Bank getBank(String bank) {

        if(bank == null) return null;
        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        } else if(bank.equalsIgnoreCase("ICICI")){
            return new ICICI();
        } else if(bank.equalsIgnoreCase("SBI")){
            return new SBI();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}
