package com.assistants.controller

import com.assistants.model.WolfResponseDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WolfController {
    @GetMapping("/wolf-sounds")
    fun getWolf(sound: String): ResponseEntity<Any> {
        val wolf = when {
            sound.contains("아우우") -> "하얀 늑대"
            sound.contains("하우우") -> "파란 늑대"
            sound.contains("와우우") -> "검은 늑대"
            sound.contains("캬우우") -> "빨간 늑대"
            else -> "회색 늑대"
        }

        return ResponseEntity.ok(WolfResponseDto(wolf))
    }
}