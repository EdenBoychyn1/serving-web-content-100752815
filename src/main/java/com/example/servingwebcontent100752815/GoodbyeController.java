package com.example.servingwebcontent100752815;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GoodbyeController {

    @GetMapping("/goodbye")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Tom") String name, Model model) {
        model.addAttribute("name", name);
        return "goodbye";
    }

}