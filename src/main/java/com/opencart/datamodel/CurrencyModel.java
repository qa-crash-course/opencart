package com.opencart.datamodel;

import com.opencart.pages.BasePage;
import com.opencart.repository.CurrencyModelRepository;
import lombok.Builder;
import lombok.Getter;
import org.apache.commons.lang3.RandomStringUtils;

@Builder
@Getter
public class CurrencyModel{
    private String currencyTitle;
    private String currencyCode;
    private String currencyValue;

    public String getCurrencyTitle() {
        return currencyTitle;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getCurrencyValue() {
        return currencyValue;
    }
}
