package com.ashen.testing_bank_app.service.impl;

import com.ashen.testing_bank_app.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
