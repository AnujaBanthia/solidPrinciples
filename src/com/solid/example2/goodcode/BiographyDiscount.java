package com.solid.example2.goodcode;

public class BiographyDiscount implements BookDiscount {

    @Override
    public String getBookDiscount() {
        String discount = "50% on the subject's birthday.";

        return discount;
    }

}