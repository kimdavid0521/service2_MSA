package com.example.service2_MSA.service;

import org.springframework.stereotype.Service;

@Service
public class NameService {

    public String getName(String id) {
        switch (id) {
            case "1":
                return "kim";
            case "2":
                return "tae";
            case "3":
                return "young";
            default:
                return "unknown";
        }
    }
}
