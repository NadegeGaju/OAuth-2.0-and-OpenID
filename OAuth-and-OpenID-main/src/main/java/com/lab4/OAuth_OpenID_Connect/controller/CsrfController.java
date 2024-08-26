package com.lab4.OAuth_OpenID_Connect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CsrfController {

    @GetMapping("/csrf-form")
    public String showCsrfForm() {
        return "csrf-form";
    }

    @PostMapping("/submit")
    public String handleSubmit(@RequestParam("someField") String someField, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message", "Form submitted successfully!");
        return "redirect:/csrf-form";
    }
}
