package com.example.springjwt2.controller;

import com.example.springjwt2.dto.JoinDTO;
import com.example.springjwt2.service.JoinService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class JoinController {

    private final JoinService joinService;

    public JoinController(JoinService joinService) {
        this.joinService = joinService;
    }

    @PostMapping("/join")
    public String joinProcess(@RequestBody JoinDTO joinDTO) {
        System.out.println(joinDTO.getUsername());
        joinService.joinProcess(joinDTO);

        return "ok";
    }
}