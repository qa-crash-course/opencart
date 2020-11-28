package com.opencart.repository;

import com.opencart.datamodel.NewCurrencyModel;
import org.apache.commons.lang3.RandomStringUtils;

public class AddNewCurrencyRepository {
    private AddNewCurrencyRepository(){
    }

    public static NewCurrencyModel getAddNewCurrencyRepository(){
       // int a = (int) Math.random();
        return NewCurrencyModel.builder()
                .currencyTitle(RandomStringUtils.randomAlphabetic(3))
                .currencyCode(1)
                .build();
    }
}
