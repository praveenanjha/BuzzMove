package com.buzzmove.test.data;

/**
 * Enumeration customer titles.
 * 
 */
public enum CustomerTitle {

    MR("Mr"), MRS("Mrs"), MISS("Miss");

    private final String name;

    CustomerTitle(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
