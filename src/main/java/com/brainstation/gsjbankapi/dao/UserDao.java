package com.brainstation.gsjbankapi.dao;

import com.brainstation.gsjbankapi.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserDTO, Integer> {
}
