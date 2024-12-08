package com.example.service2_MSA.controller;

import com.example.service2_MSA.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {

    @Autowired
    NameService nameService;

    @GetMapping("/{id}")
    public String name(@PathVariable("id") String id) {
        return nameService.getName(id);
    }
}
