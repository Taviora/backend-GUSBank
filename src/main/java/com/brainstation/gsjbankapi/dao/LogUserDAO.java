package com.brainstation.gsjbankapi.dao;

import com.brainstation.gsjbankapi.dto.LogUserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogUserDAO extends JpaRepository<LogUserDTO,Integer> {
}
