package com.ashen.testing_bank_app.service.impl;

import com.ashen.testing_bank_app.dto.BankResponse;
import com.ashen.testing_bank_app.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(final UserRequest userRequest);
}
