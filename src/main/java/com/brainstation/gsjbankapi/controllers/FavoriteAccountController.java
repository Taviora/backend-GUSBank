package com.brainstation.gsjbankapi.controllers;

import com.brainstation.gsjbankapi.models.Account;
import com.brainstation.gsjbankapi.models.FavoriteAccount;
import com.brainstation.gsjbankapi.models.User;
import com.brainstation.gsjbankapi.services.FavoriteAccount.FavoriteAccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/favorite-account/")
@CrossOrigin(origins = "http://localhost:3000")
public class FavoriteAccountController {

    private FavoriteAccountService favoriteAccountService;

    public FavoriteAccountController(FavoriteAccountService favoriteAccountService){
        this.favoriteAccountService = favoriteAccountService;
    }

    @PostMapping()
    public ResponseEntity saveFavoriteAccount(@RequestBody FavoriteAccount favoriteAccount){

        if(favoriteAccountService.saveFavoriteAccount(favoriteAccount) != null){
            return new ResponseEntity(favoriteAccount, HttpStatus.OK);
        }else{
            return new ResponseEntity("Account already exists", HttpStatus.ALREADY_REPORTED);
        }
    }

    @GetMapping("{accountId}")
    public ResponseEntity  getFavoriteAccountById(@PathVariable("accountId") int id){
        if(favoriteAccountService.getFavoriteAccountById(id) != null){
            return new ResponseEntity(favoriteAccountService.getFavoriteAccountById(id),HttpStatus.OK);
        } else{
            return new ResponseEntity("Account not found",HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("byUserId/{userId}")
    public ResponseEntity getAllFavoriteAccountsForUser(@PathVariable("userId") int id){
        return new ResponseEntity(favoriteAccountService.getAllUsersFavoriteAccountById(id),HttpStatus.OK);
    }

    @DeleteMapping("{accountId}")
    public ResponseEntity deleteFavoriteAccount(@PathVariable("accounId") int id){

        FavoriteAccount favoriteAccount = favoriteAccountService.getFavoriteAccountById(id);

        if(favoriteAccount != null){
            favoriteAccountService.removeFavoriteAccount(favoriteAccount);
            return  new ResponseEntity(favoriteAccount,HttpStatus.OK);
        }else{
            return  new ResponseEntity("Error with delete method",HttpStatus.NOT_ACCEPTABLE);
        }
    }

}
