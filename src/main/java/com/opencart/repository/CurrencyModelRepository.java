package com.opencart.repository;

import com.opencart.datamodel.CurrencyModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class CurrencyModelRepository {
    public static String name = RandomStringUtils.randomAlphabetic(1).toUpperCase()
                           + RandomStringUtils.randomAlphabetic(3 ).toLowerCase();
    private CurrencyModelRepository() {
    }
    public static CurrencyModel getCurrencyModel() {
        return CurrencyModel.builder()
                .currencyTitle(CurrencyModelRepository.name)
                .currencyCode((RandomStringUtils.randomAlphabetic(3)).toUpperCase())
                .currencyValue("0." + RandomUtils.nextInt(1,9999))
                .build();
    }
}