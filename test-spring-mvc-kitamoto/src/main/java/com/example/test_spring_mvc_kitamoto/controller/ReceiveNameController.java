package com.example.test_spring_mvc_kitamoto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_mvc_kitamoto.form.ReceiveNameForm;

@Controller
@RequestMapping("/exam03")
public class ReceiveNameController {

    @ModelAttribute
    public ReceiveNameForm receiveNameForm() {
        return new ReceiveNameForm();
    }

    @RequestMapping("")
    public String index() {
        return "name-form";
    }

    @RequestMapping("show")
    public String show(String name) {
        System.out.println("入力された値は" + name + "です");
        return "finished";
    }

    // フォーム受け取りパターン
    @RequestMapping("/show2")
    public String show2(ReceiveNameForm receiveNameForm) {
        System.out.println("入力された値は" + receiveNameForm.getName() + "です");
        return "finished";
    }
    
}
