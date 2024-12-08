package com.ashen.testing_bank_app.service.impl;

import com.ashen.testing_bank_app.dto.*;

public interface UserService {
    BankResponse createAccount(final UserRequest userRequest);
    BankResponse balanceEnquiry(final EnquiryRequest enquiryRequest);
    String nameEnquiry(final EnquiryRequest enquiryRequest);
    BankResponse creditAccount(CreditDebitRequest creditDebitRequest);
    BankResponse debitAccount(CreditDebitRequest creditDebitRequest);
    BankResponse transferRequest(final TransferRequest transferRequest);
}
