package com.ai.springai.controller;

import com.ai.springai.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    @Autowired
    private ChatService chatService;

    @GetMapping("/ask")
    public String getResponse(@RequestParam String prompt){
        return chatService.getResponse(prompt);
    }
}
