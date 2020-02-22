package com.brainstation.gsjbankapi.services.Account;

import com.brainstation.gsjbankapi.dto.AccountDTO;
import com.brainstation.gsjbankapi.dto.UserDTO;
import com.brainstation.gsjbankapi.models.Account;
import com.brainstation.gsjbankapi.models.User;

import java.util.ArrayList;
import java.util.List;

public interface AccountService  {

    Account saveAccount(Account account);

    Account getAccountById(int id);

    boolean removeAccountById(Account account);

    Account updateAccount(Account account);

    List<Account> getAllUsersAccountById(int id);
}
