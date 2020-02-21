package com.brainstation.gsjbankapi.controllers;

import com.brainstation.gsjbankapi.models.AccountMovement;
import com.brainstation.gsjbankapi.services.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account-movement/")
public class AccountMovementController {

    private AccountService accountService;

    public AccountMovementController(AccountService accountService){
        this.accountService = accountService;
    }


}
