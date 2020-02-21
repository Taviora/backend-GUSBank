package com.brainstation.gsjbankapi.dao;

import com.brainstation.gsjbankapi.dto.PayServiceDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayServiceDao extends JpaRepository<PayServiceDTO,Integer> {
}
