package org.ars.aichatbot;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChatController {
    private final ChatClient chatClient;

    public ChatController(ChatClient.Builder chatClient) {
        this.chatClient = chatClient.build();
    }

    @GetMapping("/deepseek")
    @ResponseBody
    public String chat() {
        return chatClient
                .prompt()
                .user("Do you know Higher Institute of Computer Science in Tunisia ?")
                .call().content();
    }
}
