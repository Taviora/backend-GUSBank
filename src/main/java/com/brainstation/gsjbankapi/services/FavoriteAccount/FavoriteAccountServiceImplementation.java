package com.brainstation.gsjbankapi.services.FavoriteAccount;

import com.brainstation.gsjbankapi.dao.FavoriteAccountDAO;
import com.brainstation.gsjbankapi.dto.FavoriteAccountDTO;
import com.brainstation.gsjbankapi.models.FavoriteAccount;
import com.brainstation.gsjbankapi.services.FavoriteAccount.FavoriteAccountService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FavoriteAccountServiceImplementation implements FavoriteAccountService {

    private FavoriteAccountDAO favoriteAccountDAO;

    public FavoriteAccountServiceImplementation(FavoriteAccountDAO favoriteAccountDAO){
        this.favoriteAccountDAO = favoriteAccountDAO;
    }

    @Override
    public FavoriteAccount saveFavoriteAccount(FavoriteAccount favoriteAccount) {
        FavoriteAccountDTO existingAccount = favoriteAccountDAO.findByAccountNumber(favoriteAccount.getAccountNumber());

        if(existingAccount == null){
            return new FavoriteAccount(favoriteAccountDAO.save(new FavoriteAccountDTO(favoriteAccount)));
        }else
        {
            return null;
        }
    }

    @Override
    public FavoriteAccount getFavoriteAccountById(int id) {
        Optional<FavoriteAccountDTO> existinAccount = favoriteAccountDAO.findById(id);
        FavoriteAccount favoriteAccount;
        if(id > 0){
            return favoriteAccount = existinAccount.map(FavoriteAccount::new).orElse(null);
        }else {
            return null;
        }
    }

    @Override
    public boolean removeFavoriteAccount(FavoriteAccount favoriteAccount){
       if(favoriteAccount.getId() > 0){
            favoriteAccountDAO.delete(new FavoriteAccountDTO(favoriteAccount));
            return true;
        }else{
           return false;
        }
    }

    @Override
    public FavoriteAccount updateFavoriteAccount(FavoriteAccount favoriteAccount) {
        return null;
    }

    @Override
    public List<FavoriteAccount> getAllUsersFavoriteAccountById(int id) {

        List<FavoriteAccountDTO> accountDTOList = favoriteAccountDAO.findAllFavoriteAccountByUserId(id);
        List<FavoriteAccount> accounts = new ArrayList<>();

        for(FavoriteAccountDTO favoriteAccountDTO: accountDTOList){
            accounts.add(new FavoriteAccount(((favoriteAccountDTO))));
        }
        return accounts;
    }
}
