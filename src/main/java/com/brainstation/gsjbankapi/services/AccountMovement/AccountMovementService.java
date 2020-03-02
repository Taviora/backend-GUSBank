package com.brainstation.gsjbankapi.services.AccountMovement;

import com.brainstation.gsjbankapi.models.AccountMovement;
import com.brainstation.gsjbankapi.models.User;

import java.util.List;

public interface AccountMovementService {

    AccountMovement saveAccountMovement(AccountMovement accountMovement);

    AccountMovement saveAccountOwnMovements(AccountMovement accountMovement);

    AccountMovement getAccountMovementById(int id);

    boolean removeAccountMovementbyId(AccountMovement accountMovement);

    AccountMovement updateAccountMovement(AccountMovement  accountMovement);

    List<AccountMovement> getAllMovementsByAccountId(int id);
}
