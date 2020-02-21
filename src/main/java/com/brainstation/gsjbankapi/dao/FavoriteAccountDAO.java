package com.brainstation.gsjbankapi.dao;

import com.brainstation.gsjbankapi.models.FavoriteAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteAccountDAO extends JpaRepository<FavoriteAccount,Integer> {
}
