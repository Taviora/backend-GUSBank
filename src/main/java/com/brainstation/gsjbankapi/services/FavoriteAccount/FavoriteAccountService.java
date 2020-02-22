package com.brainstation.gsjbankapi.services.FavoriteAccount;


import com.brainstation.gsjbankapi.models.Account;
import com.brainstation.gsjbankapi.models.FavoriteAccount;

import java.util.List;

public interface FavoriteAccountService {

    FavoriteAccount saveFavoriteAccount(FavoriteAccount favoriteAccount);

    FavoriteAccount getFavoriteAccountById(int id);

    boolean removeFavoriteAccount(FavoriteAccount favoriteAccount);

    FavoriteAccount updateFavoriteAccount(FavoriteAccount favoriteAccount);

    List<FavoriteAccount> getAllUsersFavoriteAccountById(int id);
}
