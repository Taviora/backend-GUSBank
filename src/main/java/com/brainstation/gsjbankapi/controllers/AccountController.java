package com.brainstation.gsjbankapi.controllers;

import com.brainstation.gsjbankapi.models.Account;
import com.brainstation.gsjbankapi.services.Account.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/account/")
@CrossOrigin(origins = "http://localhost:3000")
public class AccountController {

    private AccountService accountService;

    public AccountController( AccountService accountService){
        this.accountService = accountService;
    }

    @PostMapping()
    public ResponseEntity saveAccount(@RequestBody Account account){

        if(accountService.saveAccount(account) != null){
            return new ResponseEntity(account, HttpStatus.OK);
        }else{
            return new ResponseEntity("Account already exists", HttpStatus.ALREADY_REPORTED);
        }
    }

    @GetMapping("{accountId}")
    public ResponseEntity  getAccountById(@PathVariable("accountId") int id){
        if(accountService.getAccountById(id) != null){
            return new ResponseEntity(accountService.getAccountById(id),HttpStatus.OK);
        } else{
            return new ResponseEntity("Account not found",HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("byUserId/{userId}")
    public ResponseEntity getAllAccountsForUser(@PathVariable("userId") int id){
        return new ResponseEntity(accountService.getAllUsersAccountById(id),HttpStatus.OK);
    }

    @GetMapping("byIbanNumber/{ibanNumber}")
    public ResponseEntity getAccountIbanNumber(@PathVariable("ibanNumber") String ibanNumber){
        return new ResponseEntity(accountService.getAccountByIbanAccount(ibanNumber),HttpStatus.OK);
    }

    @GetMapping("byBalance/{userId}")
    public ResponseEntity getAllAccountsForUserAndBalance(@PathVariable("userId") int id){
        return new ResponseEntity(accountService.getAllUsersAccountByIdAndBalance(id),HttpStatus.OK);
    }
}
