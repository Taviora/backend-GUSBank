package com.brainstation.gsjbankapi.dao;

import com.brainstation.gsjbankapi.dto.AccountDTO;
import com.brainstation.gsjbankapi.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao extends JpaRepository<AccountDTO,Integer> {

    @Query("SELECT t FROM com.brainstation.gsjbankapi.dto.AccountDTO t where t.ibanNumber = :ibanNumber")
    AccountDTO findByIbanNumber(@Param("ibanNumber") String ibanNumber);


    @Query("SELECT t FROM com.brainstation.gsjbankapi.dto.AccountDTO t where t.userId = :userId")
    List<AccountDTO> findAllAccountByUserId(@Param("userId") int userId);
}
