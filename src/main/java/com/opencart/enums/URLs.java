package com.opencart.enums;

public enum URLs {
    BASE_URL(TeamLocalURLs.KRYNYTSKY_BASE_URL),
    ADMIN_URL(TeamLocalURLs.KRYNYTSKY_ADMIN_URL);

    private static class TeamLocalURLs
    {
        private static final String KRYNYTSKY_BASE_URL = "http://localhost/upload";
        private static final String KRYNYTSKY_ADMIN_URL = "http://localhost/upload/admin";
        private static final String HRYSIUK_BASE_URL = "http://localhost/opencart/upload/";
    }

    private final String value;

    URLs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
