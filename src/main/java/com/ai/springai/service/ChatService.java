package com.ai.springai.service;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final ChatModel chatModel;


    public ChatService(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    //this method is used to get the response from the model
//    public String getResponse(String prompt){
//        return chatModel.call(prompt);
//    }

    //with this method we can specify the model and temperature and other options
    // more options at openai docs
    public String getResponse(String prompt){
        ChatResponse chatResponse = chatModel.call(
                new Prompt(prompt,
                        OpenAiChatOptions.builder()
                                .withModel("gpt-4o-mini")
                                .withTemperature(0.4)
                                .withMaxTokens(400)
                                .build())
        );
        return chatResponse.getResult().getOutput().getContent();
    }
}
