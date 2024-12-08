package com.ashen.testing_bank_app.utils;

import java.time.Year;

public class AccountUtils {
    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "User account already exists";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_CREATION_SUCCESS_MESSAGE = "Account creation successful";
    public static final String ACCOUNT_NOT_EXIST_CODE = "003";
    public static final String ACCOUNT_NOT_EXIST_MESSAGE = "User with the provided account number does not exist ";
    public static final String ACCOUNT_FOUND_CODE = "004";
    public static final String ACCOUNT_FOUND_MESSAGE = "User account found";
    public static final String ACCOUNT_CREDITED_SUCCESS_CODE = "005";
    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE = "User account credited successful";
    public static final String ACCOUNT_DEBITED_SUCCESS_CODE = "006";
    public static final String ACCOUNT_DEBITED_SUCCESS_MESSAGE = "User account debited successful";
    public static final String INSUFFICIENT_BALANCE_CODE = "007";
    public static final String INSUFFICIENT_BALANCE_MESSAGE = "Insufficient balance";
    public static final String SOURCE_ACCOUNT_DOES_NOT_EXIST_CODE = "008";
    public static final String SOURCE_ACCOUNT_DOES_NOT_EXIST_MESSAGE = "Credit account does not exist";
    public static final String DESTINATION_ACCOUNT_DOES_NOT_EXIST_CODE = "009";
    public static final String DESTINATION_ACCOUNT_DOES_NOT_EXIST_MESSAGE = "Debit account does not exist";
    public static final String TRANSFER_SUCCESSFUL_CODE = "010";
    public static final String TRANSFER_SUCCESSFUL_MESSAGE = "Transfer successful";


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
