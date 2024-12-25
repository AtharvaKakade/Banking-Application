package com.atharva.banking_application.service.impl;

import com.atharva.banking_application.dto.BankResponse;
import com.atharva.banking_application.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
