package com.brainstation.gsjbankapi.services;

import com.brainstation.gsjbankapi.dao.AccountMovementDAO;
import com.brainstation.gsjbankapi.dto.AccountMovementDTO;
import com.brainstation.gsjbankapi.dto.UserDTO;
import com.brainstation.gsjbankapi.models.AccountMovement;
import com.brainstation.gsjbankapi.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountMovementServiceImplementation implements AccountMovementService {

    private AccountMovementDAO accountMovementDAO;

    public  AccountMovementServiceImplementation(AccountMovementDAO accountMovementDAO){
        this.accountMovementDAO = accountMovementDAO;
    }


    @Override
    public AccountMovement saveAccountMovement(AccountMovement accountMovement) {

        if(accountMovement.getOriginAccount() != null){
            return new AccountMovement(accountMovementDAO.save(new AccountMovementDTO(accountMovement)));
        }else{
            return null;
        }
    }

    @Override
    public AccountMovement getAccountMovementById(int id) {
        return null;
    }

    @Override
    public boolean removeAccountMovementbyId(AccountMovement accountMovement) {
        return false;
    }

    @Override
    public AccountMovement updateAccountMovement(AccountMovement accountMovement) {
        return null;
    }

    @Override
    public List<AccountMovement> getAllMovementsByAccountId(int id) {
        return null;
    }
}
