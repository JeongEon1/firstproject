package com.globalit.account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

  @GetMapping("/sign-up")
  public String signUpForm(Model model){
    // account/sign-up 으로 이동할 때,
    // SignUpForm 객체를 생성해서
    // SignUpForm 이라는 변수에 할당해서 넘김
    // SignUpForm signUpForm - new SignUpForm();
    model.addAttribute("signUpForm", new SignUpForm());
    return "account/sign-up";
  }
}
