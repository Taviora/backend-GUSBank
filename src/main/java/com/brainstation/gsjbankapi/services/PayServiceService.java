package com.brainstation.gsjbankapi.services;

import com.brainstation.gsjbankapi.models.PayService;
import com.brainstation.gsjbankapi.models.User;

public interface PayServiceService {

    PayService savePayService(PayService payService);

    PayService getPayServiceById(int id);

    boolean removePayServicebyId(PayService payService);

    PayService updatePayService(PayService payService);
}
