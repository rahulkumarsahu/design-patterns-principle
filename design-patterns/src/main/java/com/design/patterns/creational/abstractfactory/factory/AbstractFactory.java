package com.design.patterns.creational.abstractfactory.factory;

import com.design.patterns.creational.abstractfactory.dto.Bank;
import com.design.patterns.creational.abstractfactory.dto.Loan;

public interface AbstractFactory {

    Bank getBank(String bank);
    Loan getLoan(String loan);
}
