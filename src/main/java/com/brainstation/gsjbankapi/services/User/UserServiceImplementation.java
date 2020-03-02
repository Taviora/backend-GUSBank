package com.brainstation.gsjbankapi.services.User;

import com.brainstation.gsjbankapi.dao.UserDao;
import com.brainstation.gsjbankapi.dto.UserDTO;
import com.brainstation.gsjbankapi.models.User;
import com.brainstation.gsjbankapi.services.User.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {

    private UserDao userDao;

    public UserServiceImplementation(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public User saveUser(User user) {
        UserDTO existingUserByEmail = userDao.findByEmail(user.getEmail());
        UserDTO existingUserByIdCard = userDao.findByIdCard((user.getIdCard()));
        if(existingUserByEmail == null && existingUserByIdCard == null){
            return new User(userDao.save(new UserDTO(user)));
        }else{
            return null;
        }
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        Optional<UserDTO> existinUser = userDao.findById(id);
        User user;
        if(id > 0){
            return user = existinUser.map(User::new).orElse(null);
        }else {
            return null;
        }
    }

    @Override
    @Transactional
    public boolean removeUserbyId(User user) {
        if(user.getId() > 0){
            userDao.delete(new UserDTO(user));
            return true;
        }else{
            return false;
        }
    }

    @Override
    @Transactional
    public User updateUser(User user) {
        UserDTO existingUserByIdCard = userDao.findByIdCard((user.getIdCard()));

        if(existingUserByIdCard != null){
            existingUserByIdCard.setPassword(user.getPassword());

            userDao.save(existingUserByIdCard);
            return new User(existingUserByIdCard);
        }else{
            return null;
        }
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        List<UserDTO> userDTOList = userDao.findAll();
        List<User> users = new ArrayList<>();

        for(UserDTO userDTO: userDTOList){
            users.add(new User((userDTO)));
        }
       return users;
    }

    @Override
    @Transactional
    public User login(String email, String password) {
        UserDTO existingUserByEmail = userDao.findByEmail(email);
        if(existingUserByEmail != null){
            if(existingUserByEmail.getEmail().equals(email) && existingUserByEmail.getPassword().equals(password)){
                return new User(existingUserByEmail);
            }else{
                return null;
            }
        }
        return null;
    }

}
