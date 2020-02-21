package com.brainstation.gsjbankapi.services;

import com.brainstation.gsjbankapi.dao.PayServiceDao;
import com.brainstation.gsjbankapi.dto.PayServiceDTO;
import com.brainstation.gsjbankapi.models.PayService;
import com.brainstation.gsjbankapi.services.PayServiceService;
import org.springframework.stereotype.Service;

@Service
public class PayServiceServiceImplementation implements PayServiceService {

    private PayServiceDao payServiceDao;

    public PayServiceServiceImplementation(PayServiceDao payServiceDao){
        this.payServiceDao = payServiceDao;
    }

    @Override
    public PayService savePayService(PayService payService) {
        return new PayService(payServiceDao.save(new PayServiceDTO((payService))));
    }


    @Override
    public PayService getPayServiceById(int id) {
        return null;
    }

    @Override
    public boolean removePayServicebyId(PayService payService) {
        return false;
    }

    @Override
    public PayService updatePayService(PayService payService) {
        return null;
    }
}
