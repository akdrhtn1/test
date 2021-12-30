package com.example.demo.controller;

import com.example.demo.Repository.PracticeRepository;
import com.example.demo.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    PracticeRepository practiceRepository;

    @GetMapping("/hello")
    public String greeting(){
        return "hello world";
    }

    @GetMapping("/{aLoginId}")
    Admin insert(@PathVariable String aLoginId){
        Admin admin = new Admin();

        admin.setARid(1);
        admin.setALoginId(aLoginId);
        admin.setAEmail("sasa@naver.com");
        admin.setAPassword("sss1");

        return practiceRepository.save(admin);

    }

}
