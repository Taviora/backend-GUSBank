package com.brainstation.gsjbankapi.controllers;

import com.brainstation.gsjbankapi.models.AccountMovement;
import com.brainstation.gsjbankapi.services.AccountMovement.AccountMovementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/account-movement/")
public class AccountMovementController {

    private AccountMovementService accountMovementService;

    public AccountMovementController(AccountMovementService accountMovementService){
        this.accountMovementService = accountMovementService;
    }

    @PostMapping()
    public ResponseEntity saveAccountMovement(@RequestBody AccountMovement accountMovement){

        if(accountMovementService.saveAccountMovement(accountMovement) != null){
            return new ResponseEntity(accountMovement, HttpStatus.OK);
        }else{
            return new ResponseEntity("Account already exists", HttpStatus.ALREADY_REPORTED);
        }
    }

    @GetMapping("{movementId}")
    public ResponseEntity  getAccountMovementById(@PathVariable("movementId") int id){
        if(accountMovementService.getAccountMovementById(id) != null){
            return new ResponseEntity(accountMovementService.getAccountMovementById(id),HttpStatus.OK);
        } else{
            return new ResponseEntity("Account not found",HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("byAccountId/{accountId}")
    public ResponseEntity getAllAccountsMovementForUser(@PathVariable("accountId") int id){
        return new ResponseEntity(accountMovementService.getAllMovementsByAccountId(id), HttpStatus.OK);
    }
}
