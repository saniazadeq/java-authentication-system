package org.example.finalproject.model.service;

import org.example.finalproject.model.carrier.LoginRequestCarrier;
import org.example.finalproject.model.carrier.SignupRequestCarrier;
import org.example.finalproject.model.entity.User;
import org.example.finalproject.model.repository.UserRepository;

public class UserService {
    public boolean login(LoginRequestCarrier carrier){
        UserRepository userRepository = new UserRepository();
        if(carrier.password().equals(userRepository.findPasswordById(carrier.username()))){
            return true;
        }else
            return false;
    }

    public boolean signup(SignupRequestCarrier signupCarrier) {
        UserRepository userRepository = new UserRepository();
        if (signupCarrier.username().isEmpty() ||
                signupCarrier.password().isEmpty() ||
                signupCarrier.email().isEmpty() ||
                userRepository.existsByUsername(signupCarrier.username())) {
            return false;
        } else {
            User user = new User(signupCarrier.username(),signupCarrier.password(),signupCarrier.email());
            userRepository.save(user);
            return true;
        }
    }

}
