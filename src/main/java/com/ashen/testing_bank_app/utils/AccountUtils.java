package com.ashen.testing_bank_app.utils;

import java.time.Year;

public class AccountUtils {
    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "User account already exists";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_CREATION_SUCCESS_MESSAGE = "Account creation successful";


    public static String generateAccountNumber() {
        /**
         * 2024 + randomSixDigits
         */
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;
        // generate a random number between min and max
        int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        // convert the current and randomNumber to string and then concatenating them
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);

        return year + randomNumber;
    }
}
