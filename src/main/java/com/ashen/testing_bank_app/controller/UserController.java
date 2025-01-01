package com.ashen.testing_bank_app.controller;

import com.ashen.testing_bank_app.dto.*;
import com.ashen.testing_bank_app.service.impl.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Tag(name = "User Account Management APIs")
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(
            summary = "Create new user account",
            description = "Creating a new user and assigning an account ID"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 CREATED"
    )
    @PostMapping("/add-user")
    public BankResponse createAccount(@RequestBody UserRequest userRequest) {
        return userService.createAccount(userRequest);
    }

    @PostMapping("/login-user")
    public BankResponse login(@RequestBody LoginDto loginDto) {
        return userService.login(loginDto);
    }

    @Operation(
            summary = "Balance Enquiry",
            description = "Given an account number, check the balance of the account"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 SUCCESS"
    )
    @GetMapping("/balanceEnquiry")
    public BankResponse getBalanceEnquiry(@RequestBody EnquiryRequest enquiryRequest) {
        return userService.balanceEnquiry(enquiryRequest);
    }

    @GetMapping("/nameEnquiry")
    public String getNameEmquiry(@RequestBody EnquiryRequest enquiryRequest) {
        return userService.nameEnquiry(enquiryRequest);
    }

    @PostMapping("/credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request) {
        return userService.creditAccount(request);
    }

    @PostMapping("/debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request) {
        return userService.debitAccount(request);
    }

    @PostMapping("/transfer")
    public BankResponse transferCredit(@RequestBody TransferRequest request) {
        return userService.transferRequest(request);
    }

}
