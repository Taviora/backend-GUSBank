package com.brainstation.gsjbankapi.services.AccountMovement;

import com.brainstation.gsjbankapi.dao.AccountMovementDAO;
import com.brainstation.gsjbankapi.dto.AccountMovementDTO;
import com.brainstation.gsjbankapi.models.AccountMovement;
import com.brainstation.gsjbankapi.services.AccountMovement.AccountMovementService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
