package com.design.patterns.creational.abstractfactory.factory;

import com.design.patterns.creational.abstractfactory.dto.*;

public class LoanFactory implements AbstractFactory {

    public Bank getBank(String bank){
        return null;
    }

    public Loan getLoan(String loan){
        if(loan == null){
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Business")){
            return new BusinessLoan();
        } else if(loan.equalsIgnoreCase("Education")){
            return new EducationLoan();
        }
        return null;
    }
}
