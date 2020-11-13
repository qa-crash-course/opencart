package com.opencart.datamodel;

public class SearchModel {

    private String inputSearch;

    SearchModel() {
    }

    public static SearchModel.Builder getBuilder() {
        return new SearchModel().new Builder();
    }

    public class Builder {
        public SearchModel.Builder inputSearch(String value) {
            inputSearch = value;
            return this;
        }

        public SearchModel build() {
            return SearchModel.this;
        }
    }
}
