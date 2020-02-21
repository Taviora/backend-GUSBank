package com.brainstation.gsjbankapi.services;

import com.brainstation.gsjbankapi.dto.UserDTO;
import com.brainstation.gsjbankapi.models.User;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public interface UserService {

    User saveUser(User user);

    User getUserById(int id);

    boolean removeUserbyId(User user);

    User updateUser(User user);

    List<User> getAllUsers();

}
