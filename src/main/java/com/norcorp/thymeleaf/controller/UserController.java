package com.norcorp.thymeleaf.controller;

import com.norcorp.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    // handler method to handle variable-expression request
    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("tanor", "tanor@gmail.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        return "variable-expression";
    }
}
