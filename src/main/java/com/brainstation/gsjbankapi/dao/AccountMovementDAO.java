package com.brainstation.gsjbankapi.dao;

import com.brainstation.gsjbankapi.dto.AccountDTO;
import com.brainstation.gsjbankapi.dto.AccountMovementDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountMovementDAO extends JpaRepository<AccountMovementDTO,Integer> {

    @Query("SELECT t FROM com.brainstation.gsjbankapi.dto.AccountMovementDTO t where t.accountId = :accountId")
    List<AccountMovementDTO> findAllAccountMovementsByAccountId(@Param("accountId") int accountId);
}
