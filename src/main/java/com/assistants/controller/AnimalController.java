package com.assistants.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {
    @GetMapping("/wolf-sounds")
    public ResponseEntity<Object> getWolf(String sound) {
        String wolf = null;
        if(sound.contains("아우우")) {
            wolf = "하얀 늑대";
        } else if(sound.contains("하우우")) {
            wolf = "파란 늑대";
        } else if(sound.contains("와우우")) {
            wolf = "검은 늑대";
        } else if(sound.contains("캬우우")) {
            wolf = "빨간 늑대";
        } else {
            wolf = "회색 늑대";
        }

        return ResponseEntity.ok(wolf);
    }
}
