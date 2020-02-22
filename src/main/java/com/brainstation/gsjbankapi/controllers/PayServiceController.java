package com.brainstation.gsjbankapi.controllers;


import com.brainstation.gsjbankapi.services.PayService.PayServiceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pay-service/")
public class PayServiceController {

    private PayServiceService payServiceService;

    public  PayServiceController(PayServiceService payServiceService){
        this.payServiceService = payServiceService;
    }

}
