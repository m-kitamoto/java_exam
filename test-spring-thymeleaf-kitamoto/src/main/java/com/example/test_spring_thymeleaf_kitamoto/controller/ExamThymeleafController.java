package com.example.test_spring_thymeleaf_kitamoto.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_thymeleaf_kitamoto.domain.Member;

@Controller
@RequestMapping("/index")
public class ExamThymeleafController {
    
    @RequestMapping("")
    public String input() {
        return "ex-thymeleaf-input";
    }

    @RequestMapping("/result")
    public String result(String name, Integer age, String hobby1, String hobby2, String hobby3, Model model) {
        Member member = new Member();
        List<String> hobbyList = new ArrayList<>();
        member.setName(name);
        member.setAge(age);
        hobbyList.add(hobby1);
        hobbyList.add(hobby2);
        hobbyList.add(hobby3);
        member.setHobbyList(hobbyList);
        model.addAttribute("member", member);
        return "ex-thymeleaf-result";
    }
}
