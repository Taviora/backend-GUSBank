package com.brainstation.gsjbankapi.dao;

import com.brainstation.gsjbankapi.dto.AccountMovementDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMovementDAO extends JpaRepository<AccountMovementDTO,Integer> {
}
