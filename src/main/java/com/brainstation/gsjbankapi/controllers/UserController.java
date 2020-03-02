package com.brainstation.gsjbankapi.controllers;

import com.brainstation.gsjbankapi.models.Login;
import com.brainstation.gsjbankapi.models.User;
import com.brainstation.gsjbankapi.security.JWTSecurity;
import com.brainstation.gsjbankapi.services.User.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user/")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    private UserService userService;
    private JWTSecurity jwtSecurity;

    public UserController(UserService userService, JWTSecurity jwtSecurity){
        this.userService = userService;
        this.jwtSecurity = jwtSecurity;
    };

    @PostMapping()
    public ResponseEntity saveUser(@RequestBody User user){

        if(userService.saveUser(user) != null){
            return new ResponseEntity(user, HttpStatus.OK);
        }else{
            return new ResponseEntity("Email or Id Card already exists", HttpStatus.BAD_REQUEST);
        }
    }


    @PostMapping("login")
    public ResponseEntity login(@RequestBody User user){

        if(userService.login(user.getEmail(),user.getPassword()) != null){
            User returnUser = userService.login(user.getEmail(),user.getPassword());
            String jwt = jwtSecurity.generateJWT(user.getEmail());
            Login login = new Login();
            login.setJwt(jwt);
            login.setId(returnUser.getId());
            login.setName(returnUser.getName());
            login.setAutenticated(true);
            login.setLastname(user.getLastname());
            return new ResponseEntity(login,HttpStatus.OK);
        }

        return new ResponseEntity("Email or password are incorrect,try again",HttpStatus.BAD_REQUEST);
    }

    @GetMapping("{userId}")
    public ResponseEntity getUserById(@PathVariable("userId") int id){

        if(userService.getUserById(id) != null){
            return new ResponseEntity(userService.getUserById(id),HttpStatus.OK);
        } else{
            return new ResponseEntity("User not found",HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    public ResponseEntity getAllUsers(){
        return new ResponseEntity(userService.getAllUsers(),HttpStatus.OK);
    }

    @PutMapping("{password}")
    public ResponseEntity updateUser(@PathVariable("password") String password,@RequestBody User user){

        userService.updateUser(user);

        return  new ResponseEntity(user,HttpStatus.OK);
    }

    @DeleteMapping("{userId}")
    public ResponseEntity deleteUser(@PathVariable("userId") int id){

       User user = userService.getUserById(id);

       if(user != null){
           userService.removeUserbyId(user);
           return  new ResponseEntity(user,HttpStatus.OK);
       }else{
           return  new ResponseEntity("Error with delete method",HttpStatus.NOT_ACCEPTABLE);
       }
    }

}
