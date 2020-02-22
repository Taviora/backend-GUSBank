package com.brainstation.gsjbankapi.services.LogUser;

import com.brainstation.gsjbankapi.dao.LogUserDAO;
import com.brainstation.gsjbankapi.dto.LogUserDTO;
import com.brainstation.gsjbankapi.models.LogUser;
import com.brainstation.gsjbankapi.services.LogUser.LogUserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LogUserServiceImplementation implements LogUserService {

    private LogUserDAO logUserDAO;

    public LogUserServiceImplementation(LogUserDAO logUserDAO){
        this.logUserDAO = logUserDAO;
    }


    @Override
    public LogUser saveLog(LogUser logUser) {
        Optional<LogUserDTO> existingLog = logUserDAO.findById(logUser.getId());

        if(existingLog == null){
            return new LogUser(logUserDAO.save(new LogUserDTO(logUser)));
        }else
        {
            return null;
        }
    }
}
