package com.atharva.banking_application.service.impl;

import com.atharva.banking_application.dto.BankResponse;
import com.atharva.banking_application.dto.UserRequest;
import com.atharva.banking_application.entity.User;
import com.atharva.banking_application.utils.AccountUtils;

public class UserServiceImpl implements UserService{
    @Override
    public BankResponse createAccount(UserRequest userRequest) {
        /**
         Creating a user and saving a new user into the database
         */
        User newUser = User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .otherName(userRequest.getOtherName())
                .gender(userRequest.getGender())
                .address(userRequest.getAddress())
                .stateOfOrigin(userRequest.getStateOfOrigin())
                .accountNumber(AccountUtils.generateAccountNumber())
                .accountBalance(0)
                .email(userRequest.getEmail())
                .build();

    }
}
