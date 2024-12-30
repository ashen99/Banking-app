package com.ashen.testing_bank_app.repository;

import com.ashen.testing_bank_app.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
