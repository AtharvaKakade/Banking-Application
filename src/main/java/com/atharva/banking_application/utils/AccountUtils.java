package com.atharva.banking_application.utils;

import java.time.Year;

public class AccountUtils {

    public static String generateAccountNumber(){
        /**
         * Account number generate karaycha 2024(year)+random number of 6 digit
         */

        Year currentyear = Year.now();
        int min = 100000;
        int max = 999999;

//    using a random number between min and max
        int randnumber = (int)Math.floor(Math.random() * (max - min + 1) + min);

        String year = String.valueOf(currentyear);
        String randomNumber = String.valueOf(randnumber);
        StringBuilder accountNumber = new StringBuilder();
        return accountNumber.append(year).append(randomNumber).toString();


    }
}
