package com.ashen.testing_bank_app.service.impl;

import com.ashen.testing_bank_app.dto.TransactionDto;
import com.ashen.testing_bank_app.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transaction);
}
