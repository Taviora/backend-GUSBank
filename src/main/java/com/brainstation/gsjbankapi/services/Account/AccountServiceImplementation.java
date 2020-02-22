package com.brainstation.gsjbankapi.services.Account;

import com.brainstation.gsjbankapi.dao.AccountDao;
import com.brainstation.gsjbankapi.dto.AccountDTO;
import com.brainstation.gsjbankapi.models.Account;
import com.brainstation.gsjbankapi.services.Account.AccountService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImplementation implements AccountService {

    private AccountDao accountDao;

    public AccountServiceImplementation(AccountDao accountDao){
        this.accountDao = accountDao;
    }


    @Override
    public Account saveAccount(Account account) {
        AccountDTO existingAccount = accountDao.findByIbanNumber(account.getIbanNumber());

        if(existingAccount == null){
           return new Account(accountDao.save(new AccountDTO(account)));
        }else
        {
            return null;
        }
    }

    @Override
    public Account getAccountById(int id) {
        Optional<AccountDTO> existinAccount = accountDao.findById(id);
        Account account;
        if(id > 0){
            return account = existinAccount.map(Account::new).orElse(null);
        }else {
            return null;
        }
    }

    @Override
    public boolean removeAccountById(Account account) {
        if(account.getId() > 0){
            accountDao.delete(new AccountDTO(account));
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Account updateAccount(Account account) {
        return null;
    }

    @Override
    public List<Account> getAllUsersAccountById(int id) {
        List<AccountDTO> accountDTOList = accountDao.findAllAccountByUserId(id);
        List<Account> accounts = new ArrayList<>();

        for(AccountDTO accountDTO: accountDTOList){
            accounts.add(new Account((accountDTO)));
        }
        return accounts;
    }
}
