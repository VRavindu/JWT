package lk.ijse.gdse.springboot.jwt.service;

import lk.ijse.gdse.springboot.jwt.dto.UserDTO;

public interface UserService {
    int saveUser(UserDTO userDTO);
    UserDTO searchUser(String username);
}
