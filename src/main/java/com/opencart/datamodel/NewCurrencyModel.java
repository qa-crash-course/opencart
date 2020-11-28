package com.opencart.datamodel;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class NewCurrencyModel {
    private String currencyTitle;
    private int currencyCode;
    private int currencyValue;

    NewCurrencyModel(){
    }
    /*

   public static AddNewCurrencyModel.Builder getBuilder(){
        return  new AddNewCurrencyModel().new Builder();
   }

    public class Builder {
        public AddNewCurrencyModel.Builder currencyTitle(String value){
            currencyTitle = value;
            return this;
        }

        public AddNewCurrencyModel.Builder currencyCode(int value){
            currencyCode = value;
            return this;
        }

        public AddNewCurrencyModel.Builder currencyValue(int value){
            currencyValue = value;
            return this;
        }

        public AddNewCurrencyModel build(){
            return AddNewCurrencyModel.this;
        }
    }
    */
}
