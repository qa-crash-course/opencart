package com.opencart.repository;

import com.opencart.datamodel.CurrencyModel;
import org.apache.commons.lang3.RandomStringUtils;

public class CurrencyModelRepository {
    private CurrencyModelRepository() {
    }

    public static CurrencyModel getCurrencyModel() {
        return CurrencyModel.builder()
                .currencyTitle(RandomStringUtils.randomAlphabetic(4))
                .currencyCode(RandomStringUtils.randomAlphabetic(3))
                .currencyValue(RandomStringUtils.randomNumeric(1))
                .build();
    }
}