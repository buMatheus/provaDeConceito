package com.ufv.provadeconceito.Service;

import com.ufv.provadeconceito.Entity.User;
import com.ufv.provadeconceito.Form.UserForm;
import com.ufv.provadeconceito.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getUser(UserForm form){
        return userRepository.getUser(form.getUsername(), form.getPassword());
    }
}
