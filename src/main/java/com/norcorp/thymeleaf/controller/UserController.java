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

    // handler method to handle selection-expression request
    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("bruno", "bruno@gmail.com", "USER", "Male");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    // handler method to handle message-expression request
    @GetMapping("message-expression")
    public String messageExpression(Model model) {
        return "message-expression";
    }

    // handler method to handle link-expression request
    @GetMapping("link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);
        return "link-expression";
    }

    // handler method to handle fragment-expression request
    @GetMapping("fragment-expression")
    public String fragmentExpression() {
        return "fragment-expression";
    }

    // add css & js
    @GetMapping("/style")
    public String addCssJs() {
        return "add-css-js";
    }

    // add bootstrap
    @GetMapping("/bootstrap")
    public String addBootstrap() {
        return "add-bootstrap";
    }

}
