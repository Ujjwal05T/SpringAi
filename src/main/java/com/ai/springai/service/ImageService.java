package com.ai.springai.service;

import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.ai.openai.OpenAiImageModel;
import org.springframework.ai.openai.OpenAiImageOptions;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    private final OpenAiImageModel imageModel;

    public ImageService(OpenAiImageModel imageModel) {
        this.imageModel = imageModel;
    }

    public ImageResponse getImage(String prompt) {
        ImageResponse imageResponse = imageModel.call(new ImagePrompt(prompt
        , OpenAiImageOptions.builder()

                        .withHeight(256)
                        .withWidth(256)
                .withModel("dall-e-2")

                        .build())

        );
        return imageResponse;
    }
}
