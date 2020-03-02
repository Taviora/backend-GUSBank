package com.brainstation.gsjbankapi.services.AccountMovement;

import com.brainstation.gsjbankapi.dao.AccountDao;
import com.brainstation.gsjbankapi.dao.AccountMovementDAO;
import com.brainstation.gsjbankapi.dto.AccountDTO;
import com.brainstation.gsjbankapi.dto.AccountMovementDTO;
import com.brainstation.gsjbankapi.models.Account;
import com.brainstation.gsjbankapi.models.AccountMovement;
import com.brainstation.gsjbankapi.services.Account.AccountService;
import com.brainstation.gsjbankapi.services.AccountMovement.AccountMovementService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountMovementServiceImplementation implements AccountMovementService {

    private AccountMovementDAO accountMovementDAO;
    private AccountService accountService;

    public  AccountMovementServiceImplementation(AccountMovementDAO accountMovementDAO,AccountService accountService){
        this.accountMovementDAO = accountMovementDAO;
        this.accountService = accountService;
    }


    @Override
    public AccountMovement saveAccountMovement(AccountMovement accountMovement) {
        Account originAccount =  accountService.getAccountByIbanAccount(accountMovement.getOriginAccount());


        if(accountMovement.getOriginAccount() != null){

            if(originAccount.getCurrency().equals("Colones")){
                float newBalance = originAccount.getBalance() - accountMovement.getBalance();
                originAccount.setBalance(newBalance);
                accountService.updateAccount(originAccount);
            }else{
                float dollar = (float) 565.84;
                float newBalance = originAccount.getBalance() - (accountMovement.getBalance()/dollar);
                originAccount.setBalance(newBalance);
                accountService.updateAccount(originAccount);
            }

            return new AccountMovement(accountMovementDAO.save(new AccountMovementDTO(accountMovement)));
        }else{
            return null;
        }
    }

    @Override
    public AccountMovement saveAccountOwnMovements(AccountMovement accountMovement) {
        Account destinationAccount =  accountService.getAccountByIbanAccount(accountMovement.getFinalAccount());
        Account originAccount =  accountService.getAccountByIbanAccount(accountMovement.getOriginAccount());


        if(accountMovement.getOriginAccount() != null){

            if(originAccount.getCurrency().equals("Colones") && destinationAccount.getCurrency().equals("Colones")){
                float newBalance = originAccount.getBalance() - accountMovement.getBalance();
                float plusBalance = destinationAccount.getBalance() + accountMovement.getBalance();
                originAccount.setBalance(newBalance);
                destinationAccount.setBalance(plusBalance);
                accountService.updateAccount(originAccount);
                accountService.updateAccount(destinationAccount);
            }else if(originAccount.getCurrency().equals("Colones") && destinationAccount.getCurrency().equals("Dollars")){
                float dollar = (float) 565.84;
                float newBalance = originAccount.getBalance() - (accountMovement.getBalance()*dollar);
                float plusBalance = destinationAccount.getBalance() + ((accountMovement.getBalance()*dollar)/dollar);
                originAccount.setBalance(newBalance);
                destinationAccount.setBalance(plusBalance);
                accountService.updateAccount(originAccount);
                accountService.updateAccount(destinationAccount);
            }else if(originAccount.getCurrency().equals("Dollars") && destinationAccount.getCurrency().equals("Dollars")){
                float newBalance = originAccount.getBalance() - accountMovement.getBalance();
                float plusBalance = destinationAccount.getBalance() + accountMovement.getBalance();
                originAccount.setBalance(newBalance);
                destinationAccount.setBalance(plusBalance);
                accountService.updateAccount(originAccount);
                accountService.updateAccount(destinationAccount);
            }else{
                float dollar = (float) 565.84;
                float newBalance = originAccount.getBalance() - (accountMovement.getBalance()/dollar);
                float plusBalance = destinationAccount.getBalance() + (accountMovement.getBalance());
                originAccount.setBalance(newBalance);
                destinationAccount.setBalance(plusBalance);
                accountService.updateAccount(originAccount);
                accountService.updateAccount(destinationAccount);
            }

            return new AccountMovement(accountMovementDAO.save(new AccountMovementDTO(accountMovement)));
        }else{
            return null;
        }
    }


    @Override
    public AccountMovement getAccountMovementById(int id) {
        Optional<AccountMovementDTO> existingMovement = accountMovementDAO.findById(id);
        AccountMovement accountMovement;
        if(id > 0){
            return accountMovement = existingMovement.map(AccountMovement::new).orElse(null);
        }else {
            return null;
        }
    }

    @Override
    public boolean removeAccountMovementbyId(AccountMovement accountMovement) {
        if(accountMovement.getId() > 0){
            accountMovementDAO.delete(new AccountMovementDTO(accountMovement));
            return true;
        }else{
            return false;
        }
    }

    @Override
    public AccountMovement updateAccountMovement(AccountMovement accountMovement) {
        return null;
    }

    @Override
    public List<AccountMovement> getAllMovementsByAccountId(int id) {

        List<AccountMovementDTO> accountMovementDTOList = accountMovementDAO.findAllAccountMovementsByAccountId(id);
        List<AccountMovement> movements = new ArrayList<>();

        for(AccountMovementDTO accountMovementDTO: accountMovementDTOList){
            movements.add(new AccountMovement((accountMovementDTO)));
        }
        return movements;
    }
}
