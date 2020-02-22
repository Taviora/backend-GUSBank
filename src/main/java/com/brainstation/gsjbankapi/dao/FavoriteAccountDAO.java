package com.brainstation.gsjbankapi.dao;

import com.brainstation.gsjbankapi.dto.AccountDTO;
import com.brainstation.gsjbankapi.dto.FavoriteAccountDTO;
import com.brainstation.gsjbankapi.models.FavoriteAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoriteAccountDAO extends JpaRepository<FavoriteAccountDTO,Integer> {

    @Query("SELECT t FROM com.brainstation.gsjbankapi.dto.FavoriteAccountDTO t where t.accountNumber = :accountNumber")
    FavoriteAccountDTO findByAccountNumber(@Param("accountNumber") String accountNumber);

    @Query("SELECT t FROM com.brainstation.gsjbankapi.dto.FavoriteAccountDTO t where t.userId = :userId")
    List<FavoriteAccountDTO> findAllFavoriteAccountByUserId(@Param("userId") int userId);
}
