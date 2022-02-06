package com.ufv.provadeconceito.Controller;


import com.ufv.provadeconceito.Entity.User;
import com.ufv.provadeconceito.Form.UserForm;
import com.ufv.provadeconceito.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class userController {

    @Autowired
    private UserService userService;

    @PostMapping("/auth")
    public ResponseEntity<User> getUserAuth(@RequestBody UserForm form){
        return ResponseEntity.ok(userService.getUser(form));
    }
}
