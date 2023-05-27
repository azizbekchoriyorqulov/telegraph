package com.example.telegraph.controller;

import com.example.telegraph.entity.UserEntity;
import com.example.telegraph.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;
    @GetMapping("/sign-up")
    public String SignUp(){
        return "signUp";

    }
@PostMapping("/sign-up")
        public String signUp(
        @ModelAttribute UserEntity user,
        Model model
)
{
userService.save(user);
model.addAttribute(user);
return "menu";
}
@GetMapping("/sign-in")
    public String signIn(
){
  return "signIn";
}
@PostMapping("/sign-in")
    public String sing_in(
            @ModelAttribute UserEntity user,
            Model model
){
    UserEntity userEntity = userService.signIn(user.userName, user.password);
    model.addAttribute(user);
    return "menu";
}

}
