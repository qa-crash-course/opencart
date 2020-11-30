package com.opencart.datamodel;

import com.opencart.pages.BasePage;
import lombok.Builder;
import lombok.Getter;

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
