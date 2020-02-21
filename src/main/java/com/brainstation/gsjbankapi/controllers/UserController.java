package com.brainstation.gsjbankapi.controllers;

import com.brainstation.gsjbankapi.models.User;
import com.brainstation.gsjbankapi.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user/")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    };

    @PostMapping()
    public ResponseEntity saveUser(@RequestBody User user){

        if(userService.saveUser(user) != null){
            return new ResponseEntity(user, HttpStatus.OK);
        }else{
            return new ResponseEntity("User already exists", HttpStatus.ALREADY_REPORTED);
        }
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

    @PutMapping()
    public ResponseEntity updateUser(@RequestBody User user){

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
