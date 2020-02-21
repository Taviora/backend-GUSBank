package com.brainstation.gsjbankapi.dao;

import com.brainstation.gsjbankapi.dto.UserDTO;
import com.brainstation.gsjbankapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserDTO, Integer> {

    @Query("SELECT t FROM com.brainstation.gsjbankapi.dto.UserDTO t where t.idCard = :idCard")
    UserDTO findByIdCard(@Param("idCard") String idCard);

    @Query("SELECT t FROM com.brainstation.gsjbankapi.dto.UserDTO t where t.email = :email")
    UserDTO findByEmail(@Param("email") String email);
}
