package com.example.telegraph.service;

import com.example.telegraph.Repository.UserRepository;
import com.example.telegraph.entity.UserEntity;
import com.example.telegraph.exeption.AuthenticationFailedException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public UserEntity save(UserEntity user){
        UserEntity save = userRepository.save(user);
return save;
    }
    public UserEntity signIn(String userName,String password){

            UserEntity byUserName = userRepository.findByUserName(userName)
                    .orElseThrow(() -> new AuthenticationFailedException("user not fount by user name"));
            if(byUserName.getPassword().equals(password))
            return byUserName;
        throw new AuthenticationFailedException("incorrect username/password");
    }

}
