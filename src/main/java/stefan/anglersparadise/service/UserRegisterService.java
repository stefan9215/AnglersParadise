package stefan.anglersparadise.service;

import stefan.anglersparadise.model.dto.UserRegisterDTO;

public interface UserRegisterService {
    void createAccount(UserRegisterDTO userRegisterDTO);
}
