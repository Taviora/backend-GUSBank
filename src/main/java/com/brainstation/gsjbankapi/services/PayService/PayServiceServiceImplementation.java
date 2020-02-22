package com.brainstation.gsjbankapi.services.PayService;

import com.brainstation.gsjbankapi.dao.PayServiceDao;
import com.brainstation.gsjbankapi.dto.PayServiceDTO;
import com.brainstation.gsjbankapi.models.PayService;
import com.brainstation.gsjbankapi.services.PayService.PayServiceService;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
        Optional<PayServiceDTO> existinPayment = payServiceDao.findById(id);
        PayService  payService;
        if(id > 0){
            return payService = existinPayment.map(PayService::new).orElse(null);
        }else {
            return null;
        }
    }

    @Override
    public boolean removePayServicebyId(PayService payService) {
        if(payService.getId() > 0){
            payServiceDao.delete(new PayServiceDTO(payService));
            return true;
        }else{
            return false;
        }
    }

    @Override
    public PayService updatePayService(PayService payService) {
        return null;
    }
}
