package com.example.unibank.controller;

import com.example.unibank.model.User;
import com.example.unibank.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private userService userService;

    @GetMapping("/")
    public String viewUsers(Model model){
        List<User> listuser = userService.getAllUsers();
        model.addAttribute("listuser",listuser);
        System.out.print("Get / ");
        return "redirect:/";
    }
    @GetMapping("/showNewUserForm")
    public String showNewUserForm(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "redirect:/";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user")User user){
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/updateUser/{id}")
    public String updateUser(@PathVariable (value = "id") Integer id, Model model){

        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "updated_user";
    }


}
