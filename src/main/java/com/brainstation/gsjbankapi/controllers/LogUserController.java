package com.brainstation.gsjbankapi.controllers;

import com.brainstation.gsjbankapi.models.Account;
import com.brainstation.gsjbankapi.models.LogUser;
import com.brainstation.gsjbankapi.services.LogUser.LogUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/log-user/")
@CrossOrigin(origins = "http://localhost:3000")
public class LogUserController {

    private LogUserService logUserService;

    public LogUserController(LogUserService logUserService){
        this.logUserService = logUserService;
    }

    @PostMapping()
    public ResponseEntity saveLogUser(@RequestBody LogUser logUser){

        if(logUserService.saveLog(logUser) != null){
            return new ResponseEntity(logUser, HttpStatus.OK);
        }else{
            return new ResponseEntity("Log exists", HttpStatus.ALREADY_REPORTED);
        }
    }
}
